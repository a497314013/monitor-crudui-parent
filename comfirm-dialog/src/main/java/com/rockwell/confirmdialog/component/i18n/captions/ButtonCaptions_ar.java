package com.rockwell.confirmdialog.component.i18n.captions;

import java.util.ListResourceBundle;

import com.rockwell.confirmdialog.ButtonType;

/**
 * I18n for the button captions. This class contains the translations for language code 'ar'.
 */
public class ButtonCaptions_ar extends ListResourceBundle {

    /**
     * See {@link ListResourceBundle#getContents()}
     */
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {ButtonType.OK.name(), "موافق"},
                {ButtonType.ABORT.name(), "أجهض"},
                {ButtonType.CANCEL.name(), "ألغ"},
                {ButtonType.YES.name(), "نعم"},
                {ButtonType.NO.name(), "لا"},
                {ButtonType.CLOSE.name(), "أغلق"},
                {ButtonType.SAVE.name(), "احفظ"},
                {ButtonType.RETRY.name(), "أعِد المحاولة"},
                {ButtonType.IGNORE.name(), "تجاهل"},
                {ButtonType.HELP.name(), "مساعدة"},
        };
    }

}

