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
public final class Precondition {

  public static <E> GeneralExpectation<E> param(E evaluative) {

    return param(evaluative, null);
  }

  public static <E> GeneralExpectation<E> param(E evaluative, String name) {

    return new GeneralExpectation<E>(
        evaluative, ExceptionProviders.invalidParameterExceptionProvider(), name);
  }

  public static StringExpectation param(String evaluative) {

    return param(evaluative, null);
  }

  public static StringExpectation param(String evaluative, String name) {

    return new StringExpectation(
        evaluative, ExceptionProviders.invalidParameterExceptionProvider(), name);
  }

  public static <N extends Number & Comparable<N>> NumberExpectation<N> param(N candidate) {

    return new NumberExpectation<N>(
        candidate, ExceptionProviders.invalidParameterExceptionProvider(), null);
  }

  public static <N extends Number & Comparable<N>> NumberExpectation<N> param(N candidate, String name) {

    return new NumberExpectation<N>(
        candidate, ExceptionProviders.invalidParameterExceptionProvider(), name);
  }

  public static ParamExpectation.OfBoolean param(boolean evaluative) {

    return new ParamExpectation.OfBoolean(evaluative, null);
  }

  public static ParamExpectation.OfBoolean param(boolean evaluative, String name) {

    return new ParamExpectation.OfBoolean(evaluative, name);
  }

  public static void assertParam(boolean evaluated) {

    assertParam(evaluated, "");
  }

  public static void assertParam(boolean evaluated, String message) {

    if (!evaluated) {
      throw new InvalidParameterException(message);
    }
  }

  public static <E> GeneralExpectation<E> state(E state, String name) {

    return new GeneralExpectation<E>(state, ExceptionProviders.invalidStateExceptionProvider(), name);
  }

  private Precondition() { }
}
