/**
 * Copyright (c) 2017 Dell Inc., or its subsidiaries. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.pravega.client.segment.impl;

import java.io.IOException;

/**
 * A segment has ended. No more events may be read from it.
 */
public class EndOfSegmentException extends IOException {

    private static final long serialVersionUID = 1L;

}
