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
        return new PageList(new BranchPage(this, "Order type").addBranch(
                new WizardChoice("Sandwich","Sandwich","Sandwich"),
                new SingleFixedChoicePage(this, "Bread").setChoices(new WizardChoice("White", "White", "White"),
                        new WizardChoice("Wheat", "Wheat","Wheat"),
                        new WizardChoice("Rye","Rye","Rye"),
                        new WizardChoice("Pretzel","Pretzel","Pretzel"),
                        new WizardChoice("Ciabatta","Ciabatta","Ciabatta"))
                        .setRequired(true),

                new MultipleFixedChoicePage(this, "Meats").setChoices(
                        new WizardChoice("Pepperoni","Pepperoni","Pepperoni"),
                        new WizardChoice("Turkey","Turkey","Turkey"),
                        new WizardChoice("Ham","Ham","Ham"),
                        new WizardChoice("Pastrami","Pastrami","Pastrami"),
                        new WizardChoice("Roast Beef","Roast Beef","Roast Beef"),
                        new WizardChoice("Bologna","Bologna","Bologna")),

                new MultipleFixedChoicePage(this, "Veggies").setChoices(
                        new WizardChoice("Tomatoes","Tomatoes","Tomatoes"),
                        new WizardChoice("Lettuce","Lettuce","Lettuce"),
                        new WizardChoice("Onions","Onions","Onions"),
                        new WizardChoice("Pickles","Pickles","Pickles"),
                        new WizardChoice("Cucumbers","Cucumbers","Cucumbers"),
                        new WizardChoice("Peppers","Peppers","Peppers")),

                new MultipleFixedChoicePage(this, "Cheeses").setChoices(
                        new WizardChoice("Swiss","Swiss","Swiss"),
                        new WizardChoice("American","American","American"),
                        new WizardChoice("Pepperjack","Pepperjack","Pepperjack"),
                        new WizardChoice("Muenster","Muenster","Muenster"),
                        new WizardChoice("Provolone","Provolone","Provolone"),
                        new WizardChoice("White American","White American" ,"White American"),
                        new WizardChoice("Cheddar","Cheddar","Cheddar"),
                        new WizardChoice("Bleu","Bleu","Bleu")),

                new BranchPage(this, "Toasted?")
                        .addBranch(
                                new WizardChoice("Yes", "Yes", "Yes"),
                                new SingleFixedChoicePage(this, "Toast time")
                                        .setChoices(new WizardChoice("30 seconds", "30 seconds", 30),
                                                new WizardChoice("1 minute", "1 minute", 60),
                                                new WizardChoice("2 minutes","2 minutes", 120)))
                        .addBranch(new WizardChoice("No","No","No"))
                        .setValue("No"))

                .addBranch(
                        new WizardChoice("Salad","Salad","Salad"),
                        new SingleFixedChoicePage(this, "Salad type").setChoices(
                                new WizardChoice("Greek","Greek","Greek"),
                                new WizardChoice("Caesar","Caesar","Caesar")).setRequired(true),

                        new SingleFixedChoicePage(this, "Dressing").setChoices(
                                new WizardChoice("No dressing","No dressing","No dressing"),
                                new WizardChoice("Balsamic","Balsamic","Balsamic"),
                                new WizardChoice("Oil & vinegar","Oil & vinegar","Oil & vinegar"),
                                new WizardChoice("Thousand Island","Thousand Island","Thousand Island"),
                                new WizardChoice("Italian","Italian","Italian")).setValue("No dressing"),
                        new NumberPage(this, "How Many Salads?").setRequired(true))
                .setRequired(true),
                new TextPage(this, "Comments").setRequired(true)

                        .setRequired(true),

                new CustomerInfoPage(this, "Your info").setRequired(true));
    }
}
