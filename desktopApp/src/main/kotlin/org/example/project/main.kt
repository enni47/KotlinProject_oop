package org.example.project


import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Мої програми"
    ) {
        App()
    }
}




//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.application
//
//fun main() = application {
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "KotlinProject_oop",
//    ) {
//        App()
//    }
//}
















//import androidx.compose.animation.AnimatedVisibility
//import androidx.compose.animation.fadeIn
//import androidx.compose.animation.fadeOut
//import androidx.compose.animation.expandVertically
//import androidx.compose.animation.shrinkVertically
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.ColorPainter
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.application
//import androidx.compose.ui.window.rememberWindowState
//
//fun main() = application {
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "AnimatedVisibility",
//        state = rememberWindowState(
//            width = 400.dp,
//            height = 420.dp
//        )
//    ) {
//        MaterialTheme {
////            false — картинка прихована.
////             true — картинка відображається.
//            var showImage by remember {
//                mutableStateOf(true)
//            }
////             false — текст прихований.
////             true — текст відображається.
//            var showText by remember {
//                mutableStateOf(false)
//            }
//            Column(
//                modifier = Modifier
//                .fillMaxSize()
//                .padding(24.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.spacedBy(16.dp)
//            ){
//                //заголовок програми
//                Text(
//                    text = "анімація елементів",
//                    fontSize = 26.sp,
//                )
//                Text(
//                    text = "оберіть, що потрібно показати"
//                )
//                //дозволяє користувачеві обрати картину
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    RadioButton(
//                        selected = showImage,
//                        onClick = {
//                            showImage = true
//                            showText = false
//                        }
//                    )
//                    Text("показати картинку")
//                }
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    RadioButton(
//                        selected = showText,
//                        onClick = {
//                            showText = true
//                            showImage = false
//                        }
//                    )
//                    Text("показати текст")
//                }
//                Divider()
////                  AnimatedVisibility
////                  visible = showImage означає,що картинка буде видимою, якщо showImage дорівнює true
////                  fadeIn — анімація появи,fadeOut — анімація зникнення
////                  expandVertically — плавне розширення, shrinkVertically — плавне згортання
//                AnimatedVisibility(
//                    visible = showImage,
//                    enter = fadeIn()+expandVertically(),
//                    exit = fadeOut()+shrinkVertically()
//                ){
//                    // ColorPainter:він створює кольорове зображення-заповнювач, щоб продемонструвати роботу Image без додаткового файлу картинки.
//                    Image(
//                        painter = ColorPainter(
//                            Color.Blue
//                        ),
//                        contentDescription = "блакитне зображення",
//                        modifier = Modifier
//                            .size(width = 220.dp, height = 140.dp)
//                    )
//
//                }
//                AnimatedVisibility(
//                    visible = showText,
//                    enter = fadeIn() +expandVertically(),
//                    exit = fadeOut()+shrinkVertically()
//                ){
//                    Text(
//                        text = "це анімований текст",
//                        fontSize = 22.sp,
//                        color = Color.Blue
//                    )
//                }
//
//
//            }
//        }
//    }
//}
//















//// бібліотеки
////бібліотека для розміщенння елементів:column, row, spacer...
//import  androidx.compose.foundation.layout.*
////імпортує елементи інтерфейсу: text, radiobutton, outlinedtextfield...
//import androidx.compose.material.*
////інструменти для роботи із станом програми
//import androidx.compose.runtime.*
////вирівнює елементи
//import androidx.compose.ui.Alignment
////дозволяє змінювати розміри, відступи та вигляди елементів
//import androidx.compose.ui.Modifier
////dp-одиниця вимірювання розмірів та відступів
//import androidx.compose.ui.unit.dp
////sp- одиниця вимірювання розміру тексту
//import androidx.compose.ui.unit.sp
////інструменти для створення вікна програми
//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.application
//import androidx.compose.ui.window.rememberWindowState
//import androidx.compose.ui.graphics.Color
//
//
//fun main() = application {
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "Світлофор",
//        state = rememberWindowState(
//            width = 400.dp,
//            height = 420.dp
//        )
//    ){
//        MaterialTheme {
//            //light за замовчуванням червоний
//            var light by remember {
//                mutableStateOf("Червоний")
//            }
//            //визначення кольору
//            val textColor = when (light) {
//                "Червоний" -> Color.Red
//                "Жовтий" -> Color.Yellow
//                "Зелений" -> Color.Green
//                else -> Color.Black
//            }
//            //під колір опридильоний надпис
//            val message = when (light) {
//                "Червоний" -> "СТОП"
//                "Жовтий" -> "УВАГА"
//                "Зелений" -> "ЙДИ"
//                else -> ""
//            }
//            //створюю вертикальне розташуваня елементів
//            Column (
//                 modifier = Modifier
//                .fillMaxSize()
//                .padding(26.dp),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.spacedBy(16.dp)
//            ){
//                //заголовок програми
//                Text(
//                    text = "Світлофор",
//                    fontSize = 30.sp,
//                )
//                //для перемикання
//                Text(
//                    text ="оберіть колір світлофора:"
//                )
//                //створюю три перемикачи
//                Row (
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    RadioButton(
//                        selected = light == "Червоний",
//                        onClick = {
//                            light = "Червоний"
//                        }
//                    )
//                    Text("Червоний")
//                }
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    RadioButton(
//                        selected = light == "Жовтий",
//                        onClick = {
//                            light = "Жовтий"
//                        }
//                    )
//                    Text("Жовтий")
//                }
//                Row (
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    RadioButton(
//                        selected = light == "Зелений",
//                        onClick = {
//                            light = "Зелений"
//                        }
//                    )
//                    Text("Зелений")
//                }
//                // розділювач між перемикачами та результатом
//                Divider()
//                //результат
//                Text(
//                    text = message,
//                    fontSize = 36.sp,
//                    color = textColor,
//                )
//            }
//
//
//        }
//
//    }
//}























//// бібліотеки
//import  androidx.compose.foundation.layout.*
////дозволяє налаштовувати тип клавіатури для поля введення
//import androidx.compose.foundation.text.KeyboardOptions
////імпортує елементи інтерфейсу: text, radiobutton, outlinedtextfield...
//import androidx.compose.material.*
////інструменти для роботи із станом програми
//import androidx.compose.runtime.*
////вирівнює елементи
//import androidx.compose.ui.Alignment
////дозволяє змінювати розміри, відступи та вигляди елементів
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.font.FontWeight
////вказує на тип даних в полі для введеня
//import androidx.compose.ui.text.input.KeyboardType
////dp-одиниця вимірювання розмірів та відступів
//import androidx.compose.ui.unit.dp
////sp- одиниця вимірювання розміру тексту
//import androidx.compose.ui.unit.sp
////інструменти для створення вікна програми
//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.WindowSize
//import androidx.compose.ui.window.application
//import androidx.compose.ui.window.rememberWindowState
//
//fun main() = application {
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "стилізатор тексту",
//        state = rememberWindowState(
//            width = 400.dp,
//            height = 420.dp
//        )
//    ){
//        MaterialTheme {
//            //зберігаю введений користувачом текст
//            var inputText by remember {
//                mutableStateOf("")
//            }
//            //false звичайний текст
//            //true жирний
//            var isBold by remember {
//                mutableStateOf(false)
//            }
//            Column(
//                modifier = Modifier
//                .fillMaxSize()
//                .padding(24.dp),
//                verticalArrangement = Arrangement.spacedBy(16.dp)
//            ){
//                Text(
//                    text = "Стилізатор тексту",
//                    fontSize= 24.sp
//                )
//                //поля для введення тексту
//                TextField(
//                    value = inputText,
//                    onValueChange = {
//                        inputText = it
//                    },
//                    label = {
//                        Text("введіть текст")
//                    },
//                    modifier = Modifier.fillMaxWidth()
//                )
//                Text("оберіть стиль:")
//                //звичайний текст
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    RadioButton(
//                        selected = !isBold,
//                        onClick = {isBold = false}
//                    )
//                    Text("звичайний")
//                }
//                //звичайний
//                Row(
//                    verticalAlignment = Alignment.CenterVertically,
//                ){
//                    RadioButton(
//                        selected = isBold,
//                        onClick = {isBold = true}
//                    )
//                    Text("жирний")
//                }
//                Divider()
//                Text("результат:")
//                //текст автоматично змінює товщину
//                Text(
//                    text = inputText,
//                    fontSize = 22.sp,
//                    fontWeight = if(isBold){
//                        FontWeight.Bold
//                    } else {
//                        FontWeight.Normal
//                    }
//                )
//            }
//        }
//    }
//}


































//// бібліотеки
////бібліотека для розміщенння елементів:column, row, spacer...
//import  androidx.compose.foundation.layout.*
////дозволяє налаштовувати тип клавіатури для поля введення
//import androidx.compose.foundation.text.KeyboardOptions
////імпортує елементи інтерфейсу: text, radiobutton, outlinedtextfield...
//import androidx.compose.material.*
////інструменти для роботи із станом програми
//import androidx.compose.runtime.*
////вирівнює елементи
//import androidx.compose.ui.Alignment
////дозволяє змінювати розміри, відступи та вигляди елементів
//import androidx.compose.ui.Modifier
////вказує на тип даних в полі для введеня
//import androidx.compose.ui.text.input.KeyboardType
////dp-одиниця вимірювання розмірів та відступів
//import androidx.compose.ui.unit.dp
////sp- одиниця вимірювання розміру тексту
//import androidx.compose.ui.unit.sp
////інструменти для створення вікна програми
//import androidx.compose.ui.window.Window
//import androidx.compose.ui.window.application
//import androidx.compose.ui.window.rememberWindowState
//
//fun main() = application {
//    //вікно програми
//    Window(
//        //якщо користувач натисне хрестик, то програма закінчиться
//        onCloseRequest = ::exitApplication,
//        title = "Калькулятор чайових",
//        //розміри вікна
//        state = rememberWindowState(
//            width = 400.dp,
//            height = 420.dp
//        )
//    ){
//        //MaterialTheme задає базове оформлення елементів інтерфейсу
//        MaterialTheme {
//            //amount зберігає суму рахунку яку вводить користувач
//            //remember запам'ятовує значення під час оновлення
//            //mutableStateOf повідомляє compose, що треба стежити за змінами
//            var amount by remember {
//                mutableStateOf("")
//            }
//            //selectedPercent зберігає обраний відсоток чайових
//            //за замовчуванням встановлено 10%
//            //коли користувач вибере інший RadioButon то значення чайових буде змінено
//            var selectedPercent by remember {
//                mutableStateOf(10)
//            }
//            //amount - це string
//            //replace замінює кому на крапку
//            //toDoubleOrNull() перетворює текст на число типу double
//            //якщо користувач нічого не увів, то буде 0.0
//            val bill = amount.replace(",",".")
//                .toDoubleOrNull() ?: 0.0
//
//
//            // чайові.ділю рахунок на 100 та множу на відсоток чайових
//            val tip = bill / 100 * selectedPercent
//
//            //вся сума до сплати рахунок + чайові
//            val total = bill + tip
//
//            //створення інтерфейсу *column розміщює всі елементи вртикально.по типу один під одним
//            Column(
//                modifier = Modifier
//                 //зайняти всю доступну площу вікна
//                .fillMaxSize()
//                //внутрішні відступи 24 dp
//                .padding(24.dp),
//                //відстань між елементами
//                verticalArrangement = Arrangement.spacedBy(12.dp)
//
//            ){
//                //заголовок програми
//                Text(
//                    text = "калькулятор чайових",
//                    fontSize = 24.sp,
//                )
//
//                //OutlinedTextField - текстове поле з рамкою
//                OutlinedTextField(
//                    //показує потосне значення amount
//                    value = amount,
//                    //кожен раз коли користувач змінює текст, то нове значення записується в amount
//                    onValueChange = {
//                        amount = it
//                    },
//
//                    //підпис поля введення
//                    label = {Text("сума рахунку (грн)")},
//
//                    //вказується що очікується десяткове число
//                    keyboardOptions = KeyboardOptions(
//                        keyboardType = KeyboardType.Decimal
//                    ),
//                    //забороняю багаторядкове введення
//                    singleLine = true,
//                    //поле займає всю доступну ширину
//                    modifier = Modifier.fillMaxWidth()
//                )
//
//                //перед вибором відсотків
//                Text("оберіть відсоток")
//                //блок вибору відсотків(row розташовує елементи по горизонту)
//                Row(
//                    verticalAlignment = Alignment.CenterVertically
//                ){
//                    //створюю список з 3 значень: 10,15,20
//                    //forEach проходить по кожному значенню та створює окремий RadioButton
//                    listOf(10,15,20).forEach{ percent ->
//                        //окремий горизонтальний блок для перемикача та його підпису
//                        Row(
//                            verticalAlignment = Alignment.CenterVertically
//                        ){
//                            RadioButton(
//                                //перевіряю зберігання поточного відсотку і якщо так то перемекч відображається активним
//                                selected = selectedPercent == percent,
//                                //коли крористувач тицяє на відсоток то ми його записуємо в selectedPercent
//                                onClick = {
//                                    selectedPercent = percent
//                                })
//                            //підпис біля перемикача: (10%, 15%, 20%)
//                            Text("$percent%")
//                        }
//                    }
//                }
//                //горизонтальна лінія яка візуально відокремлює налаштування від результатів
//                Divider()
//                //виведення суми чайових. %.2f означає що число буде з двома знаками після коми відображатись
//                Text(
//                    text = "сума чайових: %.2f гри".format(tip),
//                    fontSize = 20.sp,
//                )
//                //виведення загальної суми
//                Text(
//                    text = "загальна сума: %.2f грн".format(total),
//                    fontSize = 22.sp,
//                )
//            }
//        }
//
//    }
//
//}


