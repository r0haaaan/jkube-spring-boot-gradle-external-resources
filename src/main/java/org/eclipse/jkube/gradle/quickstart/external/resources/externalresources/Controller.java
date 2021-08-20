/**
 * Copyright (c) 2019 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at:
 * <p>
 * https://www.eclipse.org/legal/epl-2.0/
 * <p>
 * SPDX-License-Identifier: EPL-2.0
 * <p>
 * Contributors:
 * Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.jkube.gradle.quickstart.external.resources.externalresources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Value("${welcome}")
  private String welcome;

  @GetMapping("/hello")
  public String hello() {
    return welcome;
  }
}
