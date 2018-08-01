/*
 * Copyright (C) 2017 The Dagger Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dagger2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import dagger.Binds;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.multibindings.IntoMap;
import javax.inject.Inject;

/**
 * The main activity application. It can be injected with any binding from both {@link Component}
 *
 */
public class MainActivity extends DaggerAppCompatActivity {


  @Subcomponent
  interface Component extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
  }

  @dagger.Module(subcomponents = Component.class)
  abstract class Module {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bind(Component.Builder builder);
  }



  @Inject
  @Model
  String model;

  @Inject
  void logInjection() {
    Log.i(MainActivity.class.getSimpleName(), "Injecting " + MainActivity.class.getSimpleName());
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_main);

    TextView greeting = (TextView) findViewById(R.id.greeting);
    String text = getResources().getString(R.string.welcome, model);
    greeting.setText(text);
  }
}
