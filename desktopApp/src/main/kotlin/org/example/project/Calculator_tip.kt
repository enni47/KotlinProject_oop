package org.example.project

// бібліотеки
//бібліотека для розміщенння елементів:column, row, spacer...
import  androidx.compose.foundation.layout.*
//дозволяє налаштовувати тип клавіатури для поля введення
import androidx.compose.foundation.text.KeyboardOptions
//імпортує елементи інтерфейсу: text, radiobutton, outlinedtextfield...
import androidx.compose.material.*
//інструменти для роботи із станом програми
import androidx.compose.runtime.*
//вирівнює елементи
import androidx.compose.ui.Alignment
//дозволяє змінювати розміри, відступи та вигляди елементів
import androidx.compose.ui.Modifier
//вказує на тип даних в полі для введеня
import androidx.compose.ui.text.input.KeyboardType
//dp-одиниця вимірювання розмірів та відступів
import androidx.compose.ui.unit.dp
//sp- одиниця вимірювання розміру тексту
import androidx.compose.ui.unit.sp
//інструменти для створення вікна програми
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
@Composable
fun Calculator_tip()  {



            //amount зберігає суму рахунку яку вводить користувач
            //remember запам'ятовує значення під час оновлення
            //mutableStateOf повідомляє compose, що треба стежити за змінами
            var amount by remember {
                mutableStateOf("")
            }
            //selectedPercent зберігає обраний відсоток чайових
            //за замовчуванням встановлено 10%
            //коли користувач вибере інший RadioButon то значення чайових буде змінено
            var selectedPercent by remember {
                mutableStateOf(10)
            }
            //amount - це string
            //replace замінює кому на крапку
            //toDoubleOrNull() перетворює текст на число типу double
            //якщо користувач нічого не увів, то буде 0.0
            val bill = amount.replace(",",".")
                .toDoubleOrNull() ?: 0.0


            // чайові.ділю рахунок на 100 та множу на відсоток чайових
            val tip = bill / 100 * selectedPercent

            //вся сума до сплати рахунок + чайові
            val total = bill + tip

            //створення інтерфейсу *column розміщює всі елементи вртикально.по типу один під одним
            Column(
                modifier = Modifier
                    //зайняти всю доступну площу вікна
                    .fillMaxSize()
                    //внутрішні відступи 24 dp
                    .padding(24.dp),
                //відстань між елементами
                verticalArrangement = Arrangement.spacedBy(12.dp)

            ){
                //заголовок програми
                Text(
                    text = "калькулятор чайових",
                    fontSize = 24.sp,
                )

                //OutlinedTextField - текстове поле з рамкою
                OutlinedTextField(
                    //показує потосне значення amount
                    value = amount,
                    //кожен раз коли користувач змінює текст, то нове значення записується в amount
                    onValueChange = {
                        amount = it
                    },

                    //підпис поля введення
                    label = {Text("сума рахунку (грн)")},

                    //вказується що очікується десяткове число
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Decimal
                    ),
                    //забороняю багаторядкове введення
                    singleLine = true,
                    //поле займає всю доступну ширину
                    modifier = Modifier.fillMaxWidth()
                )

                //перед вибором відсотків
                Text("оберіть відсоток")
                //блок вибору відсотків(row розташовує елементи по горизонту)
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    //створюю список з 3 значень: 10,15,20
                    //forEach проходить по кожному значенню та створює окремий RadioButton
                    listOf(10,15,20).forEach{ percent ->
                        //окремий горизонтальний блок для перемикача та його підпису
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            RadioButton(
                                //перевіряю зберігання поточного відсотку і якщо так то перемекч відображається активним
                                selected = selectedPercent == percent,
                                //коли крористувач тицяє на відсоток то ми його записуємо в selectedPercent
                                onClick = {
                                    selectedPercent = percent
                                })
                            //підпис біля перемикача: (10%, 15%, 20%)
                            Text("$percent%")
                        }
                    }
                }
                //горизонтальна лінія яка візуально відокремлює налаштування від результатів
                Divider()
                //виведення суми чайових. %.2f означає що число буде з двома знаками після коми відображатись
                Text(
                    text = "сума чайових: %.2f гри".format(tip),
                    fontSize = 20.sp,
                )
                //виведення загальної суми
                Text(
                    text = "загальна сума: %.2f грн".format(total),
                    fontSize = 22.sp,
                )
            }
        }




