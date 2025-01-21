/*
 * Copyright 2012-2025 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.validation;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for validation.
 *
 * @author Yanming Zhou
 * @since 3.5.0
 */
@ConfigurationProperties(prefix = "spring.validation")
public class ValidationProperties {

	private Method method = new Method();

	public Method getMethod() {
		return this.method;
	}

	public void setMethod(Method method) {
		this.method = method;
	}

	/**
	 * Method validation properties.
	 */
	public static class Method {

		/**
		 * Whether to adapt ConstraintViolations to MethodValidationResult.
		 */
		private boolean adaptConstraintViolations;

		public boolean isAdaptConstraintViolations() {
			return this.adaptConstraintViolations;
		}

		public void setAdaptConstraintViolations(boolean adaptConstraintViolations) {
			this.adaptConstraintViolations = adaptConstraintViolations;
		}

	}

}
