/*
 * Artifactory is a binaries repository manager.
 * Copyright (C) 2011 JFrog Ltd.
 *
 * Artifactory is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Artifactory is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Artifactory.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.artifactory.cli.common;

/**
 * @author freds
 * @date Sep 1, 2008
 */
public class OptionInfo extends BaseParam implements Option {

    public OptionInfo(String name, String description) {
        this(name, description, false, null);
    }

    public OptionInfo(String name, String description, boolean needExtraParam, String paramDescription) {
        super(name, description, needExtraParam, paramDescription);
    }

    public String argValue() {
        return OPTION_PREFIX + name;
    }

}
