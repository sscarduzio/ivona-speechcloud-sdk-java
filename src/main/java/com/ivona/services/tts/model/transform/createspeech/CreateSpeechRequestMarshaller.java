/*
 * Copyright 2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 *    http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.ivona.services.tts.model.transform.createspeech;

import com.amazonaws.Request;
import com.ivona.services.tts.model.CreateSpeechRequest;

/**
 * An interface for CreateSpeechRequest Marshallers.
 */
public interface CreateSpeechRequestMarshaller {
    public Request<CreateSpeechRequest> marshall(CreateSpeechRequest createSpeechRequest);
}
