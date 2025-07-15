package com.skycoming.aidedlearningvbnet.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.skycoming.aidedlearningvbnet.Fragments.ArrayFragment;
import com.skycoming.aidedlearningvbnet.Fragments.BasicDatatypeFragment;
import com.skycoming.aidedlearningvbnet.Fragments.BasicOperatorsFragment;
import com.skycoming.aidedlearningvbnet.Fragments.BasicSyntaxFragment;
import com.skycoming.aidedlearningvbnet.Fragments.CharacterFragment;
import com.skycoming.aidedlearningvbnet.Fragments.EventHandlingFragment;
import com.skycoming.aidedlearningvbnet.Fragments.RegularExpressionFragment;
import com.skycoming.aidedlearningvbnet.Fragments.StatementFragment;
import com.skycoming.aidedlearningvbnet.Fragments.DecisionMakingFragment;
import com.skycoming.aidedlearningvbnet.Fragments.HomeFragment;
import com.skycoming.aidedlearningvbnet.Fragments.JavaEnviromentSetupFragment;
import com.skycoming.aidedlearningvbnet.Fragments.LoopControlFragment;
import com.skycoming.aidedlearningvbnet.Fragments.MethodsFragment;
import com.skycoming.aidedlearningvbnet.Fragments.ModifierTypesFragment;
import com.skycoming.aidedlearningvbnet.Fragments.NumberFragment;
import com.skycoming.aidedlearningvbnet.Fragments.ObjectClassesFragment;
import com.skycoming.aidedlearningvbnet.Fragments.OverViewFragment;
import com.skycoming.aidedlearningvbnet.Fragments.StringFragment;
import com.skycoming.aidedlearningvbnet.Fragments.VariableTypesFragment;


public class PagerAdapter extends FragmentPagerAdapter {

    private static final int count = 18;
    private final HomeFragment homeFragment;
    private final OverViewFragment overViewFragment;
    private final JavaEnviromentSetupFragment javaEnviromentSetupFragment;
    private final BasicSyntaxFragment basicSyntaxFragment;
    private final ObjectClassesFragment objectClassesFragment;
    private final StatementFragment constructorFragment;

    private final BasicDatatypeFragment basicDatatypeFragment;
    private final VariableTypesFragment variableTypesFragment;
    private final ModifierTypesFragment modifierTypesFragment;
    private final BasicOperatorsFragment basicOperatorsFragment;
    private final LoopControlFragment loopControlFragment;
    private final DecisionMakingFragment decisionMakingFragment;
    private final NumberFragment numberFragment;

    private final CharacterFragment characterFragment;
    private final StringFragment stringFragment;
    private final ArrayFragment arrayFragment;
    private final MethodsFragment methodsFragment;

    private final EventHandlingFragment eventHandlingFragment;
    private final StatementFragment statementFragment;
    private final RegularExpressionFragment regularExpressionFragment;




    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
        homeFragment = new HomeFragment();
        overViewFragment = new OverViewFragment();
        javaEnviromentSetupFragment = new JavaEnviromentSetupFragment();
        basicSyntaxFragment = new BasicSyntaxFragment();
        objectClassesFragment = new ObjectClassesFragment();
        constructorFragment = new StatementFragment();

        basicDatatypeFragment = new BasicDatatypeFragment();
        variableTypesFragment = new VariableTypesFragment();
        modifierTypesFragment = new ModifierTypesFragment();
        basicOperatorsFragment = new BasicOperatorsFragment();
        loopControlFragment = new LoopControlFragment();
        decisionMakingFragment = new DecisionMakingFragment();
        numberFragment = new NumberFragment();

        characterFragment = new CharacterFragment();
        stringFragment = new StringFragment();
        arrayFragment = new ArrayFragment();
        methodsFragment = new MethodsFragment();

        eventHandlingFragment= new EventHandlingFragment();
        statementFragment = new StatementFragment();
        regularExpressionFragment = new RegularExpressionFragment();
    }


    @NonNull
    @Override
    public Fragment getItem(int i) {
        if (i == 0 ){

            return homeFragment;
        }
        else if (i==1){
            return overViewFragment;
        }
        else if (i==2){
            return javaEnviromentSetupFragment;
        }
        else if (i==3){
            return basicSyntaxFragment;
        }
        else if (i==4){
            return basicDatatypeFragment;
        }
        else if (i==5){
            return variableTypesFragment;
        }
        else if (i==6){
            return modifierTypesFragment;
        }else if (i==7){
            return statementFragment;
        }else if (i==8){
            return basicOperatorsFragment;
        }else if (i==9){
            return decisionMakingFragment;
        }else if (i==10){
            return loopControlFragment;
        }else if (i==11){
            return stringFragment;
        }else if (i==12){
            return arrayFragment;
        }
        else if (i==13){
            return numberFragment;
        }
        else if (i==14){
            return objectClassesFragment;
        }
        else if (i==15){
            return characterFragment;
        }
        else if (i==16){
            return regularExpressionFragment;
        } else if (i == 17){
            return eventHandlingFragment;
        }





        else {
            return homeFragment;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
           // return  "Images";
        } else {
          //  return "Videos";
        }

        return null;
    }

    @Override
    public int getCount() {
        return count;
    }



}
