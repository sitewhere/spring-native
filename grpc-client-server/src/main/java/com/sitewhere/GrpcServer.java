/**
 * Copyright © 2014-2021 The SiteWhere Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sitewhere;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.sitewhere.grpc.test.GetLocationRequest;
import com.sitewhere.grpc.test.GetLocationResponse;
import com.sitewhere.grpc.test.LocationServiceGrpc;
import com.sitewhere.grpc.test.LocationServiceGrpc.LocationServiceBlockingStub;
import com.sitewhere.grpc.test.model.TestModel.NamedLocation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

/**
 * Implements simple gRPC server.
 */
@Component
public class GrpcServer implements InitializingBean {

    /** Static logger */
    private static Log LOGGER = LogFactory.getLog(GrpcServer.class);

    /** Port for gRPC service */
    public static final int GRPC_PORT = 9000;

    /** GRPC server */
    private Server grpcServer;

    /*
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
	LOGGER.info("Starting gRPC server..");
	this.grpcServer = ServerBuilder.forPort(GRPC_PORT).addService(new LocationService()).build();
	getGrpcServer().start();

	LOGGER.info("Server started. Attempting client request..");
	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", GRPC_PORT).usePlaintext().build();
	LocationServiceBlockingStub stub = LocationServiceGrpc.newBlockingStub(channel);
	GetLocationRequest request = GetLocationRequest.newBuilder().setName("Atlanta").build();
	GetLocationResponse response = stub.getLocation(request);
	LOGGER.info(String.format("Successful request to gRPC server. Response was %s %s %s",
		response.getLocation().getName(), String.valueOf(response.getLocation().getLatitude()),
		String.valueOf(response.getLocation().getLongitude())));
    }

    public Server getGrpcServer() {
	return grpcServer;
    }

    /**
     * Location service implementation.
     */
    public static class LocationService extends LocationServiceGrpc.LocationServiceImplBase {

	/*
	 * @see com.sitewhere.grpc.test.LocationServiceGrpc.LocationServiceImplBase#
	 * getLocation(com.sitewhere.grpc.test.GetLocationRequest,
	 * io.grpc.stub.StreamObserver)
	 */
	@Override
	public void getLocation(GetLocationRequest request, StreamObserver<GetLocationResponse> responseObserver) {
	    NamedLocation location = NamedLocation.newBuilder().setName("Atlanta").setLatitude(33.753746)
		    .setLongitude(-84.386330).build();
	    GetLocationResponse response = GetLocationResponse.newBuilder().setLocation(location).build();
	    responseObserver.onNext(response);
	    responseObserver.onCompleted();
	}
    }
}
