/*
 * Copyright (c) Terl Tech Ltd • 04/05/18 23:13 • goterl.com
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v2.0. If a copy of the MPL was not distributed with this
 * file, you can obtain one at http://mozilla.org/MPL/2.0/.
 */

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import com.goterl.lazycode.lazysodium.LazySodiumJava;
import com.goterl.lazycode.lazysodium.SodiumJava;
import org.junit.BeforeClass;

public class BaseTest {

    public static LazySodiumJava lazySodium = new LazySodiumJava(new SodiumJava());

}
