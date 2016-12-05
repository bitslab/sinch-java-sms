/**
 * This package contains a Java interface for the CLX Communications XMS API.
 * This API is intended for managing and sending batches of SMS messages as well
 * as receiving mobile originated messages.
 * <p>
 * The typical use case of this library is to create a long lived
 * {@link com.clxcommunications.xms.ApiConnection} object which is then used to
 * submit batches and perform other interaction with the XMS endpoint.
 * <p>
 * As a simple initial example we can consider a program that, when run, sends a
 * single SMS and exits.
 * 
 * <pre>
 * import com.clxcommunications.xms.ApiConnection;
 * import com.clxcommunications.xms.ClxApi;
 * import com.clxcommunications.xms.api.MtBatchTextSmsResult;
 * 
 * public class Example {
 * 
 *     public static void main(String[] args) {
 *         ApiConnection conn = ApiConnection.builder()
 *                 .username("my username")
 *                 .token("my token")
 *                 .start();
 * 
 *         try {
 *             MtBatchTextSmsResult result =
 *                     conn.createBatch(ClxApi.buildBatchTextSms()
 *                             .from("my short code")
 *                             .addTo("my destination")
 *                             .body("my message")
 *                             .build());
 * 
 *             System.out.println("The batch ID is " + result.id());
 *         } catch (Exception e) {
 *             System.err.println("Failed to send message: " + e.getMessage());
 *         }
 *     }
 * 
 * }
 * </pre>
 */
package com.clxcommunications.xms;

/*-
 * #%L
 * SDK for CLX XMS
 * %%
 * Copyright (C) 2016 CLX Communications
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
