/*
 * Copyright (c) 2003, 2015, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.lang;

import java.lang.annotation.*;

/**
 * Indicates that the annotated method replaces one that would have
 * been inherited (or otherwise implicitly declared). Using this
 * annotation is optional, so its absence does not guarantee that the
 * method is newly introduced.
 *
 * <p>There are three cases:
 *
 * <ul>
 *   <li>The method does override or implement a method declared in a
 *       supertype.
 *   <li>The method is override-equivalent to a public method of the
 *       {@link Object} class. (This matters for interface methods.)
 *   <li>The method is an <em>accessor method</em> of a record class
 *       (explicit or implicit).
 * </ul>
 *
 * <p>In any other case, Java compilers are required to generate an
 * error.
 *
 * <p><b>Note:</b> although a static method may <em>hide</em> another
 * static method, this is not true overriding, and this annotation
 * does not apply.
 *
 * <p><b>Warning:</b> annotating a record component declaration merely
 * propagates that annotation to an implicitly declared accessor
 * method. In that location it is always valid, by the third point in
 * the list above, so it does <em>not</em> enforce that any supertype
 * method is being overridden.
 *
 * @author Peter von der Ah&eacute;
 * @author Joshua Bloch
 * @jls 8.4.8 Inheritance, Overriding, and Hiding
 * @jls 8.10.3 Record Members
 * @jls 9.4.1 Inheritance and Overriding
 * @jls 9.6.4.4 @Override
 * @since 1.5
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {
}
