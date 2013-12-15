package gwtquery.plugins.ui.widgets;

import gwtquery.plugins.ui.Ui;
import gwtquery.plugins.ui.UiPlugin;
import gwtquery.plugins.ui.UiWidget;
import gwtquery.plugins.ui.WidgetOptions;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayMixed;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.query.client.Function;

/**
 * Implements jQuery-UI's Datepicker
 * 
 * @see <a href="http://docs.jquery.com/UI/Datepicker">jQuery-UI's Datepicker</a>
 * 
 * @author Philippe Laflamme
 */
public class Datepicker extends UiWidget<Datepicker, Datepicker.Options> {

  public static class Options extends WidgetOptions<Options> {

    protected Options() {

    }

    public static native final Options create()
    /*-{
      return {};
    }-*/;

    public native final Options altField(String altField)
    /*-{
      this["altField"] = altField;
      return this;
    }-*/;

    public native final String altField()
    /*-{
      return this["altField"];
    }-*/;

    public native final Options altFormat(String altFormat)
    /*-{
      this["altFormat"] = altFormat;
      return this;
    }-*/;

    public native final String altFormat()
    /*-{
      return this["altFormat"];
    }-*/;

    public native final Options appendText(String appendText)
    /*-{
      this["appendText"] = appendText;
      return this;
    }-*/;

    public native final String appendText()
    /*-{
      return this["appendText"];
    }-*/;

    public native final Options autoSize(boolean autoSize)
    /*-{
      this["autoSize"] = autoSize;
      return this;
    }-*/;

    public native final boolean autoSize()
    /*-{
      return this["autoSize"];
    }-*/;

    public native final Options buttonImage(String buttonImage)
    /*-{
      this["buttonImage"] = buttonImage;
      return this;
    }-*/;

    public native final String buttonImage()
    /*-{
      return this["buttonImage"];
    }-*/;

    public native final Options buttonImageOnly(boolean buttonImageOnly)
    /*-{
      this["buttonImageOnly"] = buttonImageOnly;
      return this;
    }-*/;

    public native final boolean buttonImageOnly()
    /*-{
      return this["buttonImageOnly"];
    }-*/;

    public native final Options buttonText(String buttonText)
    /*-{
      this["buttonText"] = buttonText;
      return this;
    }-*/;

    public native final String buttonText()
    /*-{
      return this["buttonText"];
    }-*/;

    public native final Options calculateWeek(Function calculateWeek)
    /*-{
      this["calculateWeek"] = calculateWeek;
      return this;
    }-*/;

    public native final Options changeMonth(boolean changeMonth)
    /*-{
      this["changeMonth"] = changeMonth;
      return this;
    }-*/;

    public native final boolean changeMonth()
    /*-{
      return this["changeMonth"];
    }-*/;

    public native final Options changeYear(boolean changeYear)
    /*-{
      this["changeYear"] = changeYear;
      return this;
    }-*/;

    public native final boolean changeYear()
    /*-{
      return this["changeYear"];
    }-*/;

    public native final Options closeText(String closeText)
    /*-{
      this["closeText"] = closeText;
      return this;
    }-*/;

    public native final String closeText()
    /*-{
      return this["closeText"];
    }-*/;

    public native final Options constrainInput(boolean constrainInput)
    /*-{
      this["constrainInput"] = constrainInput;
      return this;
    }-*/;

    public native final boolean constrainInput()
    /*-{
      return this["constrainInput"];
    }-*/;

    public native final Options currentText(String currentText)
    /*-{
      this["currentText"] = currentText;
      return this;
    }-*/;

    public native final String currentText()
    /*-{
      return this["currentText"];
    }-*/;

    public native final Options dateFormat(String dateFormat)
    /*-{
      this["dateFormat"] = dateFormat;
      return this;
    }-*/;

    public native final String dateFormat()
    /*-{
      return this["dateFormat"];
    }-*/;

    public native final Options dayNames(JsArrayString dayNames)
    /*-{
      this["dayNames"] = dayNames;
      return this;
    }-*/;

    public native final JsArrayString dayNames()
    /*-{
      return this["dayNames"];
    }-*/;

    public native final Options dayNamesMin(JsArrayString dayNamesMin)
    /*-{
      this["dayNamesMin"] = dayNamesMin;
      return this;
    }-*/;

    public native final JsArrayString dayNamesMin()
    /*-{
      return this["dayNamesMin"];
    }-*/;

    public native final Options dayNamesShort(JsArrayString dayNamesShort)
    /*-{
      this["dayNamesShort"] = dayNamesShort;
      return this;
    }-*/;

    public native final JsArrayString dayNamesShort()
    /*-{
      return this["dayNamesShort"];
    }-*/;

    public native final Options defaultDate(JsDate defaultDate)
    /*-{
      this["defaultDate"] = defaultDate;
      return this;
    }-*/;

    public native final Options defaultDate(int defaultDate)
    /*-{
      this["defaultDate"] = defaultDate;
      return this;
    }-*/;

    public native final Options defaultDate(String defaultDate)
    /*-{
      this["defaultDate"] = defaultDate;
      return this;
    }-*/;

    public native final Options duration(String duration)
    /*-{
      this["duration"] = duration;
      return this;
    }-*/;

    public native final Options duration(int duration)
    /*-{
      this["duration"] = duration;
      return this;
    }-*/;

    public native final Options firstDay(int firstDay)
    /*-{
      this["firstDay"] = firstDay;
      return this;
    }-*/;

    public native final int firstDay()
    /*-{
      this["firstDay"] = firstDay;
      return this;
    }-*/;

    public native final Options gotoCurrent(boolean gotoCurrent)
    /*-{
      this["gotoCurrent"] = gotoCurrent;
      return this;
    }-*/;

    public native final boolean gotoCurrent()
    /*-{
      return this["gotoCurrent"];
    }-*/;

    public native final Options hideIfNoPrevNext(boolean hideIfNoPrevNext)
    /*-{
      this["hideIfNoPrevNext"] = hideIfNoPrevNext;
      return this;
    }-*/;

    public native final boolean hideIfNoPrevNext()
    /*-{
      return this["hideIfNoPrevNext"];
    }-*/;

    public native final Options isRTL(boolean isRTL)
    /*-{
      this["isRTL"] = isRTL;
      return this;
    }-*/;

    public native final boolean isRTL()
    /*-{
      return this["isRTL"];
    }-*/;

    public native final Options maxDate(JsDate maxDate)
    /*-{
      this["maxDate"] = maxDate;
      return this;
    }-*/;

    public native final Options maxDate(int maxDate)
    /*-{
      this["maxDate"] = maxDate;
      return this;
    }-*/;

    public native final Options maxDate(String maxDate)
    /*-{
      this["maxDate"] = maxDate;
      return this;
    }-*/;

    public native final Options minDate(JsDate minDate)
    /*-{
      this["minDate"] = minDate;
      return this;
    }-*/;

    public native final Options minDate(int minDate)
    /*-{
      this["minDate"] = minDate;
      return this;
    }-*/;

    public native final Options minDate(String minDate)
    /*-{
      this["minDate"] = minDate;
      return this;
    }-*/;

    public native final Options monthNames(JsArrayString monthNames)
    /*-{
      this["monthNames"] = monthNames;
      return this;
    }-*/;

    public native final JsArrayString monthNames()
    /*-{
      return this["monthNames"];
    }-*/;

    public native final Options monthNamesShort(JsArrayString monthNamesShort)
    /*-{
      this["monthNamesShort"] = monthNamesShort;
      return this;
    }-*/;

    public native final JsArrayString monthNamesShort()
    /*-{
      return this["monthNamesShort"];
    }-*/;

    public native final Options navigationAsDateFormat(boolean navigationAsDateFormat)
    /*-{
      this["navigationAsDateFormat"] = navigationAsDateFormat;
      return this;
    }-*/;

    public native final boolean navigationAsDateFormat()
    /*-{
      return this["navigationAsDateFormat"];
    }-*/;

    public native final Options nextText(String nextText)
    /*-{
      this["nextText"] = nextText;
      return this;
    }-*/;

    public native final String nextText()
    /*-{
      return this["nextText"];
    }-*/;

    public native final Options numberOfMonths(int numberOfMonths)
    /*-{
      this["numberOfMonths"] = numberOfMonths;
      return this;
    }-*/;

    public native final Options numberOfMonths(int rows, int cols)
    /*-{
      this["numberOfMonths"] = [rows, cols];
      return this;
    }-*/;

    public native final Options prevText(String prevText)
    /*-{
      this["prevText"] = prevText;
      return this;
    }-*/;

    public native final String prevText()
    /*-{
      return this["prevText"];
    }-*/;

    public native final Options selectOtherMonths(boolean selectOtherMonths)
    /*-{
      this["selectOtherMonths"] = selectOtherMonths;
      return this;
    }-*/;

    public native final boolean selectOtherMonths()
    /*-{
      return this["selectOtherMonths"];
    }-*/;

    public native final Options shortYearCutoff(String shortYearCutoff)
    /*-{
      this["shortYearCutoff"] = shortYearCutoff;
      return this;
    }-*/;

    public native final Options shortYearCutoff(int shortYearCutoff)
    /*-{
      this["shortYearCutoff"] = shortYearCutoff;
      return this;
    }-*/;

    public native final Options showAnim(String showAnim)
    /*-{
      this["showAnim"] = showAnim;
      return this;
    }-*/;

    public native final String showAnim()
    /*-{
      return this["showAnim"];
    }-*/;

    public native final Options showButtonPanel(boolean showButtonPanel)
    /*-{
      this["showButtonPanel"] = showButtonPanel;
      return this;
    }-*/;

    public native final boolean showButtonPanel()
    /*-{
      return this["showButtonPanel"];
    }-*/;

    public native final Options showCurrentAtPos(int showCurrentAtPos)
    /*-{
      this["showCurrentAtPos"] = showCurrentAtPos;
      return this;
    }-*/;

    public native final int showCurrentAtPos()
    /*-{
      return this["showCurrentAtPos"];
    }-*/;

    public native final Options showMonthAfterYear(boolean showMonthAfterYear)
    /*-{
      this["showMonthAfterYear"] = showMonthAfterYear;
      return this;
    }-*/;

    public native final boolean showMonthAfterYear()
    /*-{
      return this["showMonthAfterYear"];
    }-*/;

    public native final Options showOn(String showOn)
    /*-{
      this["showOn"] = showOn;
      return this;
    }-*/;

    public native final String showOn()
    /*-{
      return this["showOn"];
    }-*/;

    public native final Options showOptions(JavaScriptObject showOptions)
    /*-{
      this["showOptions"] = showOptions;
      return this;
    }-*/;

    public native final JavaScriptObject showOptions()
    /*-{
      return this["showOptions"];
    }-*/;

    public native final Options showOtherMonths(boolean showOtherMonths)
    /*-{
      this["showOtherMonths"] = showOtherMonths;
      return this;
    }-*/;

    public native final boolean showOtherMonths()
    /*-{
      return this["showOtherMonths"];
    }-*/;

    public native final Options showWeek(boolean showWeek)
    /*-{
      this["showWeek"] = showWeek;
      return this;
    }-*/;

    public native final boolean showWeek()
    /*-{
      return this["showWeek"];
    }-*/;

    public native final Options stepMonths(int stepMonths)
    /*-{
      this["stepMonths"] = stepMonths;
      return this;
    }-*/;

    public native final int stepMonths()
    /*-{
      return this["stepMonths"];
    }-*/;

    public native final Options weekHeader(String weekHeader)
    /*-{
      this["weekHeader"] = weekHeader;
      return this;
    }-*/;

    public native final String weekHeader()
    /*-{
      return this["weekHeader"];
    }-*/;

    public native final Options yearRange(String yearRange)
    /*-{
      this["yearRange"] = yearRange;
      return this;
    }-*/;

    public native final String yearRange()
    /*-{
      return this["yearRange"];
    }-*/;

    public native final Options yearSuffix(String yearSuffix)
    /*-{
      this["yearSuffix"] = yearSuffix;
      return this;
    }-*/;

    public native final String yearSuffix()
    /*-{
      return this["yearSuffix"];
    }-*/;

    public native final Options beforeShow(DatepickerCallbacks callback)
    /*-{
      this['beforeShow'] = function(input, instance) {
        return callback.@gwtquery.plugins.ui.widgets.Datepicker.DatepickerCallbacks::beforeShow(Lcom/google/gwt/dom/client/InputElement;Lcom/google/gwt/core/client/JavaScriptObject;)(input, instance);
      };
      return this;
    }-*/;

    public native final Options beforeShowDay(DatepickerCallbacks callback)
    /*-{
      this['beforeShowDay'] = function(date) {
        return callback.@gwtquery.plugins.ui.widgets.Datepicker.DatepickerCallbacks::beforeShowDay(Lcom/google/gwt/core/client/JsDate;)(date);
      };
      return this;
    }-*/;

    public native final Options onChangeMonthYear(DatepickerCallbacks callback)
    /*-{
      this['onChangeMonthYear'] = function(year, month, ui) {
        return callback.@gwtquery.plugins.ui.widgets.Datepicker.DatepickerCallbacks::onChangeMonthYear(IILcom/google/gwt/core/client/JavaScriptObject;)(year, month, ui);
      };
      return this;
    }-*/;

    public native final Options onClose(DatepickerCallbacks callback)
    /*-{
      this['onClose'] = function(date, ui) {
        return callback.@gwtquery.plugins.ui.widgets.Datepicker.DatepickerCallbacks::onClose(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(date, ui);
      };
      return this;
    }-*/;

    public native final Options onSelect(DatepickerCallbacks callback)
    /*-{
      this['onSelect'] = function(date, ui) {
        return callback.@gwtquery.plugins.ui.widgets.Datepicker.DatepickerCallbacks::onSelect(Ljava/lang/String;Lcom/google/gwt/core/client/JavaScriptObject;)(date, ui);
      };
      return this;
    }-*/;

  }

  public static class Event extends JavaScriptObject {

    public static final String create = "datepickercreate";

    protected Event() {
    }

  }

  public static class DatepickerCallbacks {

    public Options beforeShow(InputElement input, JavaScriptObject ui) {
      return Options.create();
    }

    /**
     * The function takes a date as a parameter and must return an array with [0] equal to true/false indicating whether
     * or not this date is selectable, [1] equal to a CSS class name(s) or '' for the default presentation, and [2] an
     * optional popup tooltip for this date. It is called for each day in the datepicker before it is displayed.
     * 
     * @param date the date being displayed
     * @return an array
     */
    public JsArrayMixed beforeShowDay(JsDate date) {
      JsArrayMixed mixed = JsArrayMixed.createArray().cast();
      mixed.push(true);
      mixed.push("");
      return mixed;
    }

    public void onChangeMonthYear(int year, int month, JavaScriptObject ui) {

    }

    public void onClose(String dateStr, JavaScriptObject ui) {

    }

    public void onSelect(String dateStr, JavaScriptObject ui) {

    }
  }

  /**
   * Used to register the plugin.
   */
  private static class DatepickerPlugin implements UiPlugin<Datepicker> {

    public Datepicker init(Ui ui, WidgetOptions<?> options) {
      return new Datepicker(ui, (Options) options.cast());
    }
  }

  public static final Class<Datepicker> Datepicker = Datepicker.class;

  static {
    registerPlugin(Datepicker.class, new DatepickerPlugin());
  }

  // Utility functions
  public static final native void setDefaults(Options options)
  /*-{
    $wnd.jQuery.datepicker.seDefaults(options);
  }-*/;

  public static final native JsDate parseDate(String format, String value, String settings)
  /*-{
    return $wnd.jQuery.datepicker.parseDate(format, value, settings);
  }-*/;

  public static final native String formatDate(String format, JsDate date, String settings)
  /*-{
    return $wnd.jQuery.datepicker.formatDate(format, date, settings);
  }-*/;

  public static final native int iso8601Week(JsDate date)
  /*-{
    return $wnd.jQuery.datepicker.iso8601Week(date);
  }-*/;

  public Datepicker(Ui ui, Datepicker.Options options) {
    super(ui, "datepicker", options);
  }

  public Datepicker close() {
    invoke("close");
    return this;
  }

  public Datepicker dialog(JsDate date, Function onSelect, Options settings, JsArrayInteger position) {
    // TODO: implement for other arguments
    invoke("dialog", date);
    return this;
  }

  public boolean isDisabled() {
    return invokeForBoolean("isDisabled");
  }

  public Datepicker hide() {
    invoke("hide");
    return this;
  }

  public Datepicker show() {
    invoke("show");
    return this;
  }

  public Datepicker refresh() {
    invoke("refresh");
    return this;
  }

  public JsDate getDate() {
    return invoke("getDate").cast();
  }

  public Datepicker setDate(JsDate date) {
    invoke("setDate", date);
    return this;
  }

  /**
   * Sets the current date for the datepicker. The new date may be a Date object or a string in the current date format
   * (e.g. '01/26/2009'), a number of days from today (e.g. +7) or a string of values and periods ('y' for years, 'm'
   * for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d'), or null to clear the selected date.
   */
  public Datepicker setDate(String date) {
    invoke("setDate", date);
    return this;
  }
}
