/*
 * Copyright 2012 Rob Fletcher
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
package grails.plugin.formfields

import grails.plugins.Plugin

class FieldsGrailsPlugin extends Plugin {

	static final String CONSTRAINTS_EVALULATOR_BEAN_NAME = 'validateableConstraintsEvaluator'

	def grailsVersion = '2023.0.0 > *'

	def loadAfter = ['domainClass']

	@Override
	Closure doWithSpring() {{->
		beanPropertyAccessorFactory(BeanPropertyAccessorFactory)
		formFieldsTemplateService(FormFieldsTemplateService)
	}}
}
