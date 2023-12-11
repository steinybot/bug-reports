package web.typings.rcTree

import web.typings.rcTree.esInterfaceMod._Direction
import web.typings.rcTree.esTreeMod.ExpandAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rcTreeStrings {
  
  @js.native
  sealed trait check extends StObject
  @scala.inline
  def check: check = "check".asInstanceOf[check]
  
  @js.native
  sealed trait children extends StObject
  @scala.inline
  def children: children = "children".asInstanceOf[children]
  
  @js.native
  sealed trait click
    extends StObject
       with ExpandAction
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait doubleClick
    extends StObject
       with ExpandAction
  @scala.inline
  def doubleClick: doubleClick = "doubleClick".asInstanceOf[doubleClick]
  
  @js.native
  sealed trait hide extends StObject
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait load extends StObject
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait ltr
    extends StObject
       with _Direction
  @scala.inline
  def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait rtl
    extends StObject
       with _Direction
  @scala.inline
  def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait select extends StObject
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait show extends StObject
  @scala.inline
  def show: show = "show".asInstanceOf[show]
}
