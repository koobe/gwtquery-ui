package gwtquery.plugins.ui;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.plugins.Effects;
import com.google.gwt.query.client.plugins.Plugin;

/**
 * Created by lyhcode on 2013/12/15.
 */
public class UiEffects extends Effects {
    protected UiEffects(GQuery gq) {
        super(gq);
    }

    public static final Class<UiEffects> UiEffects = GQuery.registerPlugin(
            UiEffects.class, new Plugin<UiEffects>() {
        public UiEffects init(GQuery gq) {
            return new UiEffects(gq);
        }
    });

    /**
     * jQuery Effect $.fn.effect()
     * http://api.jqueryui.com/effect/
     *
     * @param effect
     * @return
     */
    public UiEffects effect(String effect) {
        nativeEffect(getSelector(), effect);
        return this;
    }

    private native void nativeEffect(String selector, String effect) /*-{
        if ($wnd.$.isFunction($wnd.$.fn.effect)) {
            $wnd.$(selector).effect(effect);
        }
    }-*/;
}
