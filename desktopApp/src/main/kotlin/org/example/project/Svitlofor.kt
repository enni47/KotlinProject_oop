package org.example.project

// бібліотеки
//бібліотека для розміщенння елементів:column, row, spacer...
import  androidx.compose.foundation.layout.*
//імпортує елементи інтерфейсу: text, radiobutton, outlinedtextfield...
import androidx.compose.material.*
//інструменти для роботи із станом програми
import androidx.compose.runtime.*
//вирівнює елементи
import androidx.compose.ui.Alignment
//дозволяє змінювати розміри, відступи та вигляди елементів
import androidx.compose.ui.Modifier
//dp-одиниця вимірювання розмірів та відступів
import androidx.compose.ui.unit.dp
//sp- одиниця вимірювання розміру тексту
import androidx.compose.ui.unit.sp
//інструменти для створення вікна програми
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import androidx.compose.ui.graphics.Color


@Composable
fun Svitlofor()  {

            //light за замовчуванням червоний
            var light by remember {
                mutableStateOf("Червоний")
            }
            //визначення кольору
            val textColor = when (light) {
                "Червоний" -> Color.Red
                "Жовтий" -> Color.Yellow
                "Зелений" -> Color.Green
                else -> Color.Black
            }
            //під колір опридильоний надпис
            val message = when (light) {
                "Червоний" -> "СТОП"
                "Жовтий" -> "УВАГА"
                "Зелений" -> "ЙДИ"
                else -> ""
            }
            //створюю вертикальне розташуваня елементів
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(26.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                //заголовок програми
                Text(
                    text = "Світлофор",
                    fontSize = 30.sp,
                )
                //для перемикання
                Text(
                    text ="оберіть колір світлофора:"
                )
                //створюю три перемикачи
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    RadioButton(
                        selected = light == "Червоний",
                        onClick = {
                            light = "Червоний"
                        }
                    )
                    Text("Червоний")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    RadioButton(
                        selected = light == "Жовтий",
                        onClick = {
                            light = "Жовтий"
                        }
                    )
                    Text("Жовтий")
                }
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    RadioButton(
                        selected = light == "Зелений",
                        onClick = {
                            light = "Зелений"
                        }
                    )
                    Text("Зелений")
                }
                // розділювач між перемикачами та результатом
                Divider()
                //результат
                Text(
                    text = message,
                    fontSize = 36.sp,
                    color = textColor,
                )
            }


        }

