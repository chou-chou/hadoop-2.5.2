/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.yarn.server.resourcemanager.scheduler.fair;

/**
 * Helper class that holds basic information to be passed around
 * FairScheduler classes. Think of this as a glorified map that holds key
 * information about the scheduler.
 */
public class FSContext {
  // Preemption-related info
  private boolean preemptionEnabled = false;
  private float preemptionUtilizationThreshold;
  private FSStarvedApps starvedApps;

  public boolean isPreemptionEnabled() {
    return preemptionEnabled;
  }

  public void setPreemptionEnabled() {
    this.preemptionEnabled = true;
    if (starvedApps == null) {
      starvedApps = new FSStarvedApps();
    }
  }

  public FSStarvedApps getStarvedApps() {
    return starvedApps;
  }

  public float getPreemptionUtilizationThreshold() {
    return preemptionUtilizationThreshold;
  }

  public void setPreemptionUtilizationThreshold(
      float preemptionUtilizationThreshold) {
    this.preemptionUtilizationThreshold = preemptionUtilizationThreshold;
  }
}
