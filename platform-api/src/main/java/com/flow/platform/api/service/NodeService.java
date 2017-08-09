/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.flow.platform.api.service;

import com.flow.platform.api.domain.Flow;
import com.flow.platform.api.domain.Node;
import java.util.List;

/**
 * @author yh@firim
 */
public interface NodeService {

    /**
     * create node and children
     */
    Node create(Node node);

    /**
     * find node by node path
     */
    Node find(String nodePath);

    /**
     * save node
     */
    Node save(Node node);

    /**
     * list current flows
     */
    List<Flow> listFlows();
}