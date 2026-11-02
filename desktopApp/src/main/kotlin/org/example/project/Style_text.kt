package org.example.project

// бібліотеки
import  androidx.compose.foundation.layout.*
//імпортує елементи інтерфейсу: text, radiobutton, outlinedtextfield...
import androidx.compose.material.*
//інструменти для роботи із станом програми
import androidx.compose.runtime.*
//вирівнює елементи
import androidx.compose.ui.Alignment
//дозволяє змінювати розміри, відступи та вигляди елементів
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
//dp-одиниця вимірювання розмірів та відступів
import androidx.compose.ui.unit.dp
//sp- одиниця вимірювання розміру тексту
import androidx.compose.ui.unit.sp
//інструменти для створення вікна програми
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun Style_text()  {

            //зберігаю введений користувачом текст
            var inputText by remember {
                mutableStateOf("")
            }
            //false звичайний текст
            //true жирний
            var isBold by remember {
                mutableStateOf(false)
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                Text(
                    text = "Стилізатор тексту",
                    fontSize= 24.sp
                )
                //поля для введення тексту
                TextField(
                    value = inputText,
                    onValueChange = {
                        inputText = it
                    },
                    label = {
                        Text("введіть текст")
                    },
                    modifier = Modifier.fillMaxWidth()
                )
                Text("оберіть стиль:")
                //звичайний текст
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    RadioButton(
                        selected = !isBold,
                        onClick = {isBold = false}
                    )
                    Text("звичайний")
                }
                //звичайний
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    RadioButton(
                        selected = isBold,
                        onClick = {isBold = true}
                    )
                    Text("жирний")
                }
                Divider()
                Text("результат:")
                //текст автоматично змінює товщину
                Text(
                    text = inputText,
                    fontSize = 22.sp,
                    fontWeight = if(isBold){
                        FontWeight.Bold
                    } else {
                        FontWeight.Normal
                    }
                )
            }
        }
