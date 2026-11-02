package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun Animacia()   {

//            false — картинка прихована.
//             true — картинка відображається.
            var showImage by remember {
                mutableStateOf(true)
            }
//             false — текст прихований.
//             true — текст відображається.
            var showText by remember {
                mutableStateOf(false)
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                //заголовок програми
                Text(
                    text = "анімація елементів",
                    fontSize = 26.sp,
                )
                Text(
                    text = "оберіть, що потрібно показати"
                )
                //дозволяє користувачеві обрати картину
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    RadioButton(
                        selected = showImage,
                        onClick = {
                            showImage = true
                            showText = false
                        }
                    )
                    Text("показати картинку")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ){
                    RadioButton(
                        selected = showText,
                        onClick = {
                            showText = true
                            showImage = false
                        }
                    )
                    Text("показати текст")
                }
                Divider()
//                  AnimatedVisibility
//                  visible = showImage означає,що картинка буде видимою, якщо showImage дорівнює true
//                  fadeIn — анімація появи,fadeOut — анімація зникнення
//                  expandVertically — плавне розширення, shrinkVertically — плавне згортання
                AnimatedVisibility(
                    visible = showImage,
                    enter = fadeIn()+expandVertically(),
                    exit = fadeOut()+shrinkVertically()
                ){
                    // ColorPainter:він створює кольорове зображення-заповнювач, щоб продемонструвати роботу Image без додаткового файлу картинки.
                    Image(
                        painter = ColorPainter(
                            Color.Blue
                        ),
                        contentDescription = "блакитне зображення",
                        modifier = Modifier
                            .size(width = 220.dp, height = 140.dp)
                    )

                }
                AnimatedVisibility(
                    visible = showText,
                    enter = fadeIn() +expandVertically(),
                    exit = fadeOut()+shrinkVertically()
                ){
                    Text(
                        text = "це анімований текст",
                        fontSize = 22.sp,
                        color = Color.Blue
                    )
                }


            }
        }

