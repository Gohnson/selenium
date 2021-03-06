// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.openqa.selenium.grid.graphql;

import org.openqa.selenium.internal.Require;

import java.net.URI;
import java.util.UUID;

public class Node {

  private final UUID id;
  private final URI uri;
  private final boolean isUp;

  public Node(UUID id, URI uri, boolean isUp) {
    this.id = Require.nonNull("Node id", id);
    this.uri = Require.nonNull("Node uri", uri);
    this.isUp = isUp;
  }

  public UUID getId() {
    return id;
  }

  public URI getUri() {
    return uri;
  }

  public String getStatus() {
    return isUp ? "UP" : "UNAVAILABLE";
  }
}
