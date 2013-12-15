/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwtquery.plugins.ui;

/**
 * A GQuery-UI widget plugin. All GQuery-UI widget plugins must implement this interface.
 * 
 * @param <T> the plugin class
 * 
 * @author Philippe Laflamme
 */
public interface UiPlugin<T extends Ui> {

  /**
   * Called by the Ui.asWidget() method in order to pass the current matched set and widget options.
   * @param ui the current matched set
   * @param options the widget options (may be null)
   * 
   * @return an instance of the {@code UiPlugin}
   */
  T init(Ui ui, WidgetOptions<?> options);

}
