/*
 * ControllerBase.cs
 * Copyright © 2011 kbinani
 *
 * This file is part of org.kbinani.cadencii.
 *
 * org.kbinani.cadencii is free software; you can redistribute it and/or
 * modify it under the terms of the GPLv3 License.
 *
 * org.kbinani.cadencii is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
package org.kbinani.cadencii;

import org.kbinani.apputil.*;


/// <summary>
/// コントローラーの基底となる抽象クラス．
/// </summary>
public abstract class ControllerBase {
    /// <summary>
    /// 現在の言語設定に基づき，文字列messageに対応するメッセージを取得します．
    /// </summary>
    /// <param name="message">翻訳元の英語のメッセージ文字列．</param>
    /// <returns>翻訳後のメッセージ文字列．デフォルトではmessageと同じ値を返します．</returns>
    /*protected static String gettext( String message )
    {
        return Messaging.getMessage( message );
    }*/
}
;
