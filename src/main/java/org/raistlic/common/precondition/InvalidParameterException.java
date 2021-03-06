/*
 * Copyright 2015 Lei CHEN (raistlic@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.raistlic.common.precondition;

/**
 * @author Lei CHEN (2015-02-13)
 * @since 1.2
 */
public class InvalidParameterException extends PreconditionException {

  public InvalidParameterException(String message) {

    super(message);
  }

  public InvalidParameterException(String message, Throwable cause) {

    super(message, cause);
  }

  public InvalidParameterException(Throwable cause) {

    super(cause);
  }
}
