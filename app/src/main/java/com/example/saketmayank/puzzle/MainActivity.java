package com.example.saketmayank.puzzle;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttonearth,buttonsun,buttonowl1,buttonowl2,buttonmonkey,
            buttonant1,buttonant2,buttonant3,buttonant4,buttonant5,
            buttoncaterpillar,buttonbutterfly,buttoncat1,buttoncat2,
            buttonslippers,buttonslippers2,buttonflower1,buttonflower2,buttonflower3,buttonflower4,buttonbook,buttonkite,b;
    RadioGroup radioGroup;
    int earth=0,sun=0,owl=0,monkey=0,ant=0,caterpillar=0,butterfly=0,cat=0,slippers=0,flower=0,book=0,kite= 0;
    MediaPlayer mp ;
    TextView score;
    int total =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonearth=(Button)findViewById(R.id.buttonearth);
        buttonsun =(Button)findViewById(R.id.buttonsun);
        buttonowl1=(Button)findViewById(R.id.buttonowl1);
        buttonowl2=(Button)findViewById(R.id.buttonowl2);
        buttonmonkey=(Button)findViewById(R.id.buttonmonkey);
        buttonant1=(Button)findViewById(R.id.buttonant1);
        buttonant2=(Button)findViewById(R.id.buttonant2);
        buttonant3=(Button)findViewById(R.id.buttonant3);
        buttonant4=(Button)findViewById(R.id.buttonant4);
        buttonant5=(Button)findViewById(R.id.buttonant5);
        buttoncaterpillar=(Button)findViewById(R.id.buttoncaterpillar);
        buttonbutterfly=(Button)findViewById(R.id.buttonbutterfly);
        buttoncat1=(Button)findViewById(R.id.buttoncat1);
        buttoncat2=(Button)findViewById(R.id.buttoncat2);
        buttonslippers=(Button)findViewById(R.id.buttonslipper1);
        buttonslippers2=(Button)findViewById(R.id.buttonslipper2);
        buttonflower1=(Button)findViewById(R.id.buttonflour1);
        buttonflower2=(Button)findViewById(R.id.buttonflower2);
        buttonflower3=(Button)findViewById(R.id.buttonflower3);
        buttonflower4=(Button)findViewById(R.id.buttonflower4);
        buttonbook=(Button)findViewById(R.id.buttonbook);
        buttonkite=(Button)findViewById(R.id.buttonkite);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup);
        score=(TextView)findViewById(R.id.score);


       

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes final int checkedId) {
                if(checkedId == R.id.ques1){
                    buttonearth.setEnabled(true);
                    buttonearth.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            earth++;
                            
                            if(earth == 1){
                                buttonearth.setEnabled(false);
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                        }
                    });


                }
                else if(checkedId == R.id.ques2){
                    buttonsun.setEnabled(true);
                    buttonsun.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            sun++;
                            
                            if(sun == 1){
                                ++total;
                                score.setText(Integer.toString(total));
                                buttonsun.setEnabled(false);
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                        }
                    });

                }
                else if(checkedId == R.id.ques3){
                    buttonowl1.setEnabled(true);
                    buttonowl2.setEnabled(true);
                    buttonowl1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            owl++;
                            
                            buttonowl1.setEnabled(false);
                            if(owl == 2){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,"1 Owl Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonowl2.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View v) {
                            owl++;
                            
                            buttonowl2.setEnabled(false);
                            if(owl == 2){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,"1 Owl Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });

                }
                else if(checkedId == R.id.ques4){
                    buttonmonkey.setEnabled(true);
                    buttonmonkey.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            monkey++;
                            
                            if(monkey == 1){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                buttonmonkey.setEnabled(false);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                        }
                    });
                }
                else if(checkedId == R.id.ques5){
                    buttonant1.setEnabled(true);
                    buttonant2.setEnabled(true);
                    buttonant3.setEnabled(true);
                    buttonant4.setEnabled(true);
                    buttonant5.setEnabled(true);
                    buttonant1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ant++;
                            
                            buttonant1.setEnabled(false);
                            if(ant == 5){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,5-ant +" Ant Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonant2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ant++;
                            
                            buttonant2.setEnabled(false);
                            if(ant == 5){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,5-ant +" Ant Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonant3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ant++;
                            
                            buttonant3.setEnabled(false);
                            if(ant == 5){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,5-ant +" Ant Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonant4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ant++;
                            
                            buttonant4.setEnabled(false);
                            if(ant == 5){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,5-ant +" Ant Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonant5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ant++;
                            
                            buttonant5.setEnabled(false);
                            if(ant == 5){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,5-ant +" Ant Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                }
                else if(checkedId == R.id.ques6){
                    buttoncaterpillar.setEnabled(true);

                    buttoncaterpillar.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                           caterpillar++;
                            
                            if(caterpillar == 1){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                buttoncaterpillar.setEnabled(false);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                        }
                    });
                }
                else if(checkedId == R.id.ques7){
                    buttonbutterfly.setEnabled(true);

                    buttonbutterfly.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            butterfly++;
                            
                            if(butterfly == 1){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                buttonbutterfly.setEnabled(false);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                        }
                    });
                }
                else if(checkedId == R.id.ques8){
                    buttoncat1.setEnabled(true);
                    buttoncat2.setEnabled(true);
                    buttoncat1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cat++;
                            
                            buttoncat1.setEnabled(false);
                            if(cat == 2){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,2-cat +" Cat Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttoncat2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cat++;
                            
                            buttoncat2.setEnabled(false);
                            if(cat == 2){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,2-cat +" Cat Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                }
                else if(checkedId == R.id.ques9){
                    buttonslippers.setEnabled(true);
                    buttonslippers2.setEnabled(true);
                    buttonslippers.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            slippers++;
                            
                            buttonslippers.setEnabled(false);
                            if(slippers == 2){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,2-slippers +" Slipper Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonslippers2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            slippers++;
                            
                            buttonslippers2.setEnabled(false);
                            if(slippers == 2){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,2-slippers +" Slipper Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });

                }
                else if(checkedId == R.id.ques10){
                    buttonflower1.setEnabled(true);
                    buttonflower2.setEnabled(true);
                    buttonflower3.setEnabled(true);
                    buttonflower4.setEnabled(true);
                    buttonflower1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            flower++;
                            
                            buttonflower1.setEnabled(false);
                            if(flower == 4){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,4-flower +" Flower Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonflower2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            flower++;
                            
                            buttonflower2.setEnabled(false);
                            if(flower == 4){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,4-flower +" Flower Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonflower3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            flower++;
                            
                            buttonflower3.setEnabled(false);
                            if(flower == 4){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,4-flower +" Flower Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                    buttonflower4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            flower++;
                            
                            buttonflower4.setEnabled(false);
                            if(flower == 4){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                            else
                                Toast.makeText(MainActivity.this,4-flower +" Flower Remaining",Toast.LENGTH_SHORT).show();
                            mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                            mp.start();
                        }
                    });
                }
                else if(checkedId == R.id.ques11){
                    buttonbook.setEnabled(true);
                    buttonbook.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            book++;
                            
                            if(book == 1){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                buttonbook.setEnabled(false);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }
                        }
                    });
                }
                else if(checkedId == R.id.ques12){
                    buttonkite.setEnabled(true);
                    buttonkite.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                           kite++;
                            
                            if(kite == 12){
                                ++total;
                                score.setText(Integer.toString(total));
                                radioGroup.findViewById(radioGroup.getCheckedRadioButtonId()).setBackgroundColor(Color.LTGRAY);
                                buttonkite.setEnabled(false);
                                Toast.makeText(MainActivity.this,"Yeah! you found the answer",Toast.LENGTH_SHORT).show();
                                mp =MediaPlayer.create(getBaseContext(),R.raw.sound_1);
                                mp.start();
                            }

                        }
                    });
                }
            }
        });




       
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuhint, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_search)
        {
            if(radioGroup.getCheckedRadioButtonId()== R.id.ques1){
                call(buttonearth);
            }
            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques2){
               call(buttonsun);
            }
            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques4){
               call(buttonmonkey);
            }
            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques11){
               call(buttonbook);
            }
            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques12){
                call(buttonkite);
            }
            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques6){
                call(buttoncaterpillar);
            }
            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques3){
                call(buttonowl1);
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonowl2);
                    }
                }, 2000);
            }
            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques5){
                call(buttonant1);
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonant2);
                    }
                }, 2000);
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonant3);
                    }
                }, 4000);
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonant4);
                    }
                }, 6000);
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonant5);
                    }
                }, 8000);



            }

           else if(radioGroup.getCheckedRadioButtonId()== R.id.ques9){
                call(buttonslippers);
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonslippers2);
                    }
                }, 2000);
            }

           else if(radioGroup.getCheckedRadioButtonId()== R.id.ques10){
                call(buttonflower1);
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonflower2);
                    }
                }, 2000);
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonflower3);
                    }
                }, 4000);
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttonflower4);
                    }
                }, 6000);

            }

            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques8){
                call(buttoncat1);
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        call(buttoncat2);
                    }
                }, 2000);
            }

            else if(radioGroup.getCheckedRadioButtonId()== R.id.ques7){
                call(buttonbutterfly);
            }
            else {
                Toast.makeText(MainActivity.this,"Please select a clue",Toast.LENGTH_SHORT).show();
            }


        }
        else if(id == R.id.menu_reset){
            startActivity(new Intent(MainActivity.this,MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    private void call(Button x) {
        b = x;
        b.setTextColor(Color.RED);
        new Handler().postDelayed(new Runnable() {

            public void run() {
                b.setTextColor(Color.TRANSPARENT);
            }
        }, 1000);
    }

}
