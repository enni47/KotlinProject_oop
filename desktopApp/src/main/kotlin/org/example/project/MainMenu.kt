package org.example.project

// Бібліотека для розміщення елементів
import androidx.compose.foundation.layout.*
// Елементи інтерфейсу
import androidx.compose.material.*
// Інструменти для роботи зі станом програми
import androidx.compose.runtime.*
// Modifier для налаштування елементів
import androidx.compose.ui.Modifier
// Розміри та відступи
import androidx.compose.ui.unit.dp
// Головне меню програми
@Composable
fun App() {
    //зберігаю назву програми
    var golovna by remember {
        mutableStateOf("Головна")
    }
    //станн меню програми
    var menu by remember {
        mutableStateOf(false)
    }
    //стан вікна довідки
    var showAbout by remember {
        mutableStateOf(false)
    }
    //загальна програма
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
            ){
                //меню вибору програм
                Box{
                    TextButton(
                        onClick = {
                            menu = true
                        }
                    ){
                        Text("Програми")
                    }
                    //випадаючий список
                    DropdownMenu(
                        expanded = menu,
                        onDismissRequest = {
                        menu = false
                    }){
                       DropdownMenuItem(
                           onClick = {
                           golovna = "калькулятор"
                               menu = false
                       }) {
                           Text("калькулятор чайових")
                       }
                        DropdownMenuItem(
                            onClick = {
                                golovna = "стилізатор"
                                menu = false
                            }
                        ){
                            Text("стилізатор тексту")
                        }
                        DropdownMenuItem(
                            onClick = {
                                golovna = "світлофор"
                                menu = false
                            }
                        ){Text("світлофор")
                        }
                        DropdownMenuItem(
                            onClick = {
                                golovna = "анімація"
                            }
                        ){
                            Text("анімація елементів")
                        }
                    }

                }
                //кнопка довідки
                TextButton(
                    onClick = {
                        showAbout = true
                    }
                ){
                    Text("Довідка")
                }
                //кнопка виходу
                TextButton(
                    onClick = {
                        kotlin.system.exitProcess(0)
                    }
                ){
                    Text("Вихід")
                }
            }
            //лінія
            Divider()
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
            ){
                //перевіряємо яку програму вибрали
                when(golovna){
                    "калькулятор" -> Calculator_tip()
                    "стилізатор" -> Style_text()
                    "світлофор" -> Svitlofor()
                    "анімація" -> Animacia()
                    else -> {
                        Column(
                            modifier = Modifier
                            .fillMaxWidth(),
                            verticalArrangement = Arrangement.Center,
                        ){
                            Text("вітаємо!")
                            Text("оберіть програму у верхньому меню")
                        }
                    }
                }
            }

        }
        if(showAbout){
            AlertDialog(
                onDismissRequest = {
                    showAbout = false
                },
                title = {
                    Text("про програму")
                },
                text = {
                    Text("навчальний проект kotlin_opp"+
                    "містить 4 програми на мові котлін")
                },
                confirmButton = {
                    TextButton(onClick = {
                        showAbout = false
                    }){
                        Text("закрити")
                    }
                }
            )
        }
    }

}