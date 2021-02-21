/*
 * Copyright 2015, The Querydsl Team (http://www.querydsl.com/team)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import static com.querydsl.jpa.JPAExpressions.select;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.querydsl.core.types.dsl.PathBuilder;
import com.querydsl.jpa.JPQLQuery;


public class PackagelessEntityTest {

    @SuppressWarnings("unchecked")
    @Test
    public void packageLess_path() {
        PathBuilder<PackagelessEntityTest> builder = new PathBuilder(PackagelessEntityTest.class,"entity");
        JPQLQuery<?> query = select(builder).from(builder);
        assertEquals("select entity\nfrom PackagelessEntityTest entity", query.toString());
    }

}
