/*
 * Copyright 2015 the original author or authors.
 *
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
 */
package com.greglturnquist.spring.social.ecobee.api;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author Greg Turnquist
 */
@Data
@RequiredArgsConstructor
public class RemoteSensorCapability {

	private final String id;
	private final String type;
	private final String value;

	public String getValue() {

		try {
			int val = Integer.parseInt(this.value);
			return String.valueOf(val / 10.0);
		} catch (NumberFormatException e) {
			return this.value;
		}
	}

}
