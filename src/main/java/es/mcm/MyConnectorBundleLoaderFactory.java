package es.mcm;

import java.util.Collection;
import java.util.HashSet;

import com.google.gwt.core.ext.typeinfo.JClassType;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.ui.absolutelayout.AbsoluteLayoutConnector;
import com.vaadin.client.ui.accordion.AccordionConnector;
import com.vaadin.client.ui.calendar.CalendarConnector;
import com.vaadin.client.ui.combobox.ComboBoxConnector;
import com.vaadin.client.ui.customlayout.CustomLayoutConnector;
import com.vaadin.client.ui.gridlayout.GridLayoutConnector;
import com.vaadin.client.ui.menubar.MenuBarConnector;
import com.vaadin.client.ui.orderedlayout.HorizontalLayoutConnector;
import com.vaadin.client.ui.orderedlayout.VerticalLayoutConnector;
import com.vaadin.client.ui.panel.PanelConnector;
import com.vaadin.client.ui.popupview.PopupViewConnector;
import com.vaadin.client.ui.richtextarea.RichTextAreaConnector;
import com.vaadin.client.ui.splitpanel.HorizontalSplitPanelConnector;
import com.vaadin.client.ui.splitpanel.VerticalSplitPanelConnector;
import com.vaadin.client.ui.table.TableConnector;
import com.vaadin.client.ui.tabsheet.TabsheetConnector;
import com.vaadin.client.ui.treetable.TreeTableConnector;
import com.vaadin.client.ui.twincolselect.TwinColSelectConnector;
import com.vaadin.client.ui.window.WindowConnector;
import com.vaadin.server.widgetsetutils.ConnectorBundleLoaderFactory;
import com.vaadin.shared.ui.Connect.LoadStyle;


public class MyConnectorBundleLoaderFactory extends ConnectorBundleLoaderFactory {
    @Override
    protected LoadStyle getLoadStyle(JClassType connectorType) {
        String c = connectorType.getQualifiedSourceName();
        if ("com.vaadin.client.ui.tabsheet.TabsheetConnector".equals(c)
          ||"com.vaadin.client.ui.accordion.AccordionConnector".equals(c)) {
            return LoadStyle.LAZY;
        }
        return super.getLoadStyle(connectorType);
    }
    
    
    Collection<String> lazyComponents = new HashSet<String>();

    public MyConnectorBundleLoaderFactory() {
//        add(VerticalLayoutConnector.class);
//        add(HorizontalLayoutConnector.class);
//        add(GridLayoutConnector.class);
//        add(AbsoluteLayoutConnector.class);
//        add(HorizontalSplitPanelConnector.class);
//        add(VerticalSplitPanelConnector.class);
        add(AccordionConnector.class);
//        add(ComboBoxConnector.class);
        add(TabsheetConnector.class);
//        add(MenuBarConnector.class);
//        add(PanelConnector.class);
//        add(WindowConnector.class);
//        add(RichTextAreaConnector.class);
//        add(TwinColSelectConnector.class);
//        add(CustomLayoutConnector.class);
//        add(PopupViewConnector.class);
//        add(CalendarConnector.class);
//        add(TableConnector.class);
//        add(TreeTableConnector.class);
    }

    private void add(Class<? extends ServerConnector> c) {
        lazyComponents.add(c.getCanonicalName());
    }


}
