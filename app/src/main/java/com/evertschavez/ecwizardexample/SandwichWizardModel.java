package com.evertschavez.ecwizardexample;

import android.content.Context;

import com.evertschavez.ecwizardexample.pages.CustomerInfoPage;
import com.evertschavez.ecwizardlibrary.model.AbstractWizardModel;
import com.evertschavez.ecwizardlibrary.model.BranchPage;
import com.evertschavez.ecwizardlibrary.model.MultipleFixedChoicePage;
import com.evertschavez.ecwizardlibrary.model.NumberPage;
import com.evertschavez.ecwizardlibrary.model.PageList;
import com.evertschavez.ecwizardlibrary.model.SingleFixedChoicePage;
import com.evertschavez.ecwizardlibrary.model.TextPage;
import com.evertschavez.ecwizardlibrary.model.WizardChoice;

public class SandwichWizardModel extends AbstractWizardModel {
    public SandwichWizardModel(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
        return new PageList(
                new BranchPage(this, "Order type")
                        .addBranch(
                                new WizardChoice("Sandwich","Sandwich_KEY"),
                                new SingleFixedChoicePage(this, "Bread")
                                        .setChoices(
                                                new WizardChoice("White", "White"),
                                                new WizardChoice("Wheat", "Wheat_KEY"),
                                                new WizardChoice("Rye","Rye_KEY"),
                                                new WizardChoice("Pretzel","Pretzel_KEY"),
                                                new WizardChoice("Ciabatta","Ciabatta_KEY"))
                                        .setRequired(true),
                                new MultipleFixedChoicePage(this, "Meats")
                                        .setChoices(
                                                new WizardChoice("Pepperoni","Pepperoni_KEY"),
                                                new WizardChoice("Turkey","Turkey_KEY"),
                                                new WizardChoice("Ham","Ham_KEY"),
                                                new WizardChoice("Pastrami","Pastrami_KEY"),
                                                new WizardChoice("Roast Beef","Roast Beef_KEY"),
                                                new WizardChoice("Bologna","Bologna_KEY")),
                                new MultipleFixedChoicePage(this, "Veggies")
                                        .setChoices(
                                                new WizardChoice("Tomatoes","Tomatoes_KEY"),
                                                new WizardChoice("Lettuce","Lettuce_KEY"),
                                                new WizardChoice("Onions","Onions_KEY"),
                                                new WizardChoice("Pickles","Pickles_KEY"),
                                                new WizardChoice("Cucumbers","Peppers_KEY"),
                                                new WizardChoice("Peppers","Peppers_KEY")),
                                new MultipleFixedChoicePage(this, "Cheeses")
                                        .setChoices(
                                                new WizardChoice("Swiss","Swiss_KEY"),
                                                new WizardChoice("American","American_KEY"),
                                                new WizardChoice("Pepperjack","Pepperjack_KEY"),
                                                new WizardChoice("Muenster","Muenster_KEY"),
                                                new WizardChoice("Provolone","Provolone_KEY"),
                                                new WizardChoice("White American","White American_KEY"),
                                                new WizardChoice("Cheddar","Cheddar_KEY"),
                                                new WizardChoice("Bleu","Bleu_KEY")),
                                new BranchPage(this, "Toasted?")
                                        .addBranch(
                                                new WizardChoice("Yes", "Yes_KEY"),
                                                new SingleFixedChoicePage(this, "Toast time_KEY")
                                                        .setChoices(new WizardChoice("30 seconds", "30 seconds_KEY"),
                                                                new WizardChoice("1 minute", "1 minute_KEY"),
                                                                new WizardChoice("2 minutes","2 minutes_KEY")))
                                        .addBranch(new WizardChoice("No","No_KEY"))
                                        .setValue("No"))
                        .addBranch(
                                new WizardChoice("Salad","Salad_KEY"),
                                new SingleFixedChoicePage(this, "Salad type_KEY")
                                        .setChoices(
                                                new WizardChoice("Greek","Greek_KEY"),
                                                new WizardChoice("Caesar","Caesar_KEY"))
                                        .setRequired(true),
                                new SingleFixedChoicePage(this, "Dressing")
                                        .setChoices(
                                                new WizardChoice("No dressing","No dressing_KEY"),
                                                new WizardChoice("Balsamic","Balsamic_KEY"),
                                                new WizardChoice("Oil & vinegar","Oil & vinegar_KEY"),
                                                new WizardChoice("Thousand Island","Thousand Island_KEY"),
                                                new WizardChoice("Italian","Italian"))
                                        .setValue("No dressing_KEY"),
                                new NumberPage(this, "How Many Salads?")
                                        .setRequired(true))
                        .setRequired(true),
                new TextPage(this, "Comments").setRequired(true).setRequired(true),
                new CustomerInfoPage(this, "Your info").setRequired(true));
    }
}
