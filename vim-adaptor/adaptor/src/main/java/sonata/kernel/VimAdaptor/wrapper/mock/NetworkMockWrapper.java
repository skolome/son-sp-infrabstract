/**
 * Copyright (c) 2015 SONATA-NFV, UCL, NOKIA, NCSR Demokritos ALL RIGHTS RESERVED.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Neither the name of the SONATA-NFV, UCL, NOKIA, NCSR Demokritos nor the names of its contributors
 * may be used to endorse or promote products derived from this software without specific prior
 * written permission.
 * 
 * This work has been performed in the framework of the SONATA project, funded by the European
 * Commission under Grant number 671517 through the Horizon 2020 and 5G-PPP programmes. The authors
 * would like to acknowledge the contributions of their colleagues of the SONATA partner consortium
 * (www.sonata-nfv.eu).
 *
 * @author Adel Zaalouk
 * @author Dario Valocchi (Ph.D.), UCL
 * 
 */

package sonata.kernel.VimAdaptor.wrapper.mock;

import sonata.kernel.VimAdaptor.commons.NetworkConfigurePayload;
import sonata.kernel.VimAdaptor.wrapper.NetworkWrapper;
import sonata.kernel.VimAdaptor.wrapper.WrapperConfiguration;

public class NetworkMockWrapper extends NetworkWrapper {

  @SuppressWarnings("unused")
  private WrapperConfiguration config;

  public NetworkMockWrapper(WrapperConfiguration config) {
    this.config = config;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * sonata.kernel.VimAdaptor.wrapper.NetworkWrapper#configureNetworking(sonata.kernel.VimAdaptor.
   * commons.NetworkConfigurePayload)
   */
  @Override
  public void configureNetworking(NetworkConfigurePayload data) throws Exception {
    return;
  }



}
