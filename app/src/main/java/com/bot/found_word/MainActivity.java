package com.bot.found_word;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textOutput;
    String poem = "У лукоморья дуб зелёный;\n" + "Златая цепь на дубе том:\n" + "И днём и ночью кот учёный\n" +
            "Всё ходит по цепи кругом;\n" + "Идёт направо — песнь заводит,\n" + "Налево — сказку говорит.\n" +
            "Там чудеса: там леший бродит,\n" + "Русалка на ветвях сидит;\n" + "Там на неведомых дорожках\n" +
            "Следы невиданных зверей;\n" + "Избушка там на курьих ножках\n" + "Стоит без окон, без дверей;\n" +
            "Там лес и дол видений полны;\n" + "Там о заре прихлынут волны\n" + "На брег песчаный и пустой,\n" +
            "И тридцать витязей прекрасных\n" + "Чредой из вод выходят ясных,\n" + "И с ними дядька их морской;\n" +
            "Там королевич мимоходом\n" + "Пленяет грозного царя;\n" + "Там в облаках перед народом\n" + "Через леса, через моря\n" +
            "Колдун несёт богатыря;\n" + "В темнице там царевна тужит,\n" + "А бурый волк ей верно служит;\n" +
            "Там ступа с Бабою Ягой\n" + "Идёт, бредёт сама собой,\n" + "Там царь Кащей над златом чахнет;\n" +
            "Там русский дух… там Русью пахнет!\n" + "И там я был, и мёд я пил;\n" + "У моря видел дуб зелёный;\n" +
            "Под ним сидел, и кот учёный\n" + "Свои мне сказки говорил.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textOutput = findViewById(R.id.Text_output);
        textOutput.setText("слова начинающиеся на а: "+wordsCharacters('а', 'А')
        + "\n кол-во слов из 5 букв:"+valueWorlds(5)
        +"\n количество букв «л»: " + numberCharacter('л', 'Л'));
    }

    private String wordsCharacters(char character, char bigCharacter){
        String stringWords = "";
        String stPoem = poem.replace("\n", " ").trim();
        String[] arrayPoem = stPoem.split(" ");
        for (String string : arrayPoem) {
            if (string.charAt(0) == character | string.charAt(0) == bigCharacter) {
                stringWords += string + " ";
            }
        }
        return stringWords.trim();
    }

    private int valueWorlds(int i){
        int value = 0;
        String stPoem = poem.replace("\n", " ").trim();
        String[] arrayPoem = stPoem.split(" ");
        for (String string : arrayPoem) {
            if (string.length()==i) {
                value++;
            }
        }
        return value;
    }

    private int numberCharacter(char character, char bigCharacter){
        int value = 0;
        for (int i = 0; i < poem.length(); i++){
            if(poem.charAt(i)==character | poem.charAt(i)==bigCharacter)
                value++;
        }
        return value;
    }
}