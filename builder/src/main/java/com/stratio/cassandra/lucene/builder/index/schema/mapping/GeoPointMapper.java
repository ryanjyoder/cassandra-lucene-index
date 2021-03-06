/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.cassandra.lucene.builder.index.schema.mapping;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * A {@link Mapper} to map geographical points.
 *
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class GeoPointMapper extends Mapper<GeoPointMapper> {

    /** The name of the column containing the latitude. */
    @JsonProperty("latitude")
    final String latitude;

    /** The name of the column containing the longitude. */
    @JsonProperty("longitude")
    final String longitude;

    /** The maximum number of levels in the tree. */
    @JsonProperty("max_levels")
    Integer maxLevels;

    /**
     * Builds a new {@code GeoPointMapper}.
     *
     * @param latitude the name of the column containing the latitude
     * @param longitude the name of the column containing the longitude
     */
    @JsonCreator
    public GeoPointMapper(@JsonProperty("latitude") String latitude, @JsonProperty("longitude") String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Sets the maximum number of levels in the tree.
     *
     * @param maxLevels the maximum number of levels
     * @return this with hte specified max number of levels
     */
    public GeoPointMapper maxLevels(Integer maxLevels) {
        this.maxLevels = maxLevels;
        return this;
    }
}
