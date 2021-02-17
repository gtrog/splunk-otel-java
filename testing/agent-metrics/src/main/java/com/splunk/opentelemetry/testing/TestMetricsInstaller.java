/*
 * Copyright Splunk Inc.
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

package com.splunk.opentelemetry.testing;

import com.google.auto.service.AutoService;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;
import io.opentelemetry.javaagent.spi.ComponentInstaller;

@AutoService(ComponentInstaller.class)
public class TestMetricsInstaller implements ComponentInstaller {
  @Override
  public void beforeByteBuddyAgent() {
    Metrics.addRegistry(new SimpleMeterRegistry());
  }
}
