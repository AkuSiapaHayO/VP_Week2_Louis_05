package com.example.visualprogweek2

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visualprogweek2.ui.theme.VisualProgWeek2Theme

class SoalMimi3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualProgWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Challenge3() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .background(color = Color(0xFFFDBBBC))
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 28.dp)
                    .padding(start = 28.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.black_arrow_back),
                    contentDescription = "ArrowBack",
                    modifier = Modifier
                        .size(34.dp)
                )
            }

            Spacer(modifier = Modifier.height(60.dp))

            Image(
                painter = painterResource(id = R.drawable.registerlogo),
                contentDescription = "Klairs",
                modifier = Modifier
                    .size(175.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(60.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFEFEFEF),
                        shape = RoundedCornerShape(topStart = 64.dp, topEnd = 64.dp)
                    )
            ) {
                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Create New Account",
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    fontSize = 22.sp,
                    color = Color(0xFF484848),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )

                Spacer(modifier = Modifier.height(24.dp))

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            Color(0xFFFEFEFE),
                            shape = RoundedCornerShape(topStart = 64.dp, topEnd = 64.dp)
                        )
                        .padding(24.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.facebook_icon),
                            contentDescription = "FaceBookIcon",
                            modifier = Modifier
                                .size(32.dp)
                        )

                        Spacer(Modifier.width(16.dp))

                        Image(
                            painter = painterResource(id = R.drawable.x_icon),
                            contentDescription = "x",
                            modifier = Modifier
                                .size(32.dp)
                        )

                        Spacer(Modifier.width(16.dp))

                        Image(
                            painter = painterResource(id = R.drawable.google_icon),
                            contentDescription = "GoogleIcon",
                            modifier = Modifier
                                .size(32.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "or use your email account",
                        color = Color(0xFF808080),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Name",
                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Ex: Jane Doe",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        color = Color(0xFF8C8C8C),
                        modifier = Modifier
                            .border(
                                color = Color(0xFF959595),
                                width = 1.dp,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(12.dp)
                            .fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Email",
                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Ex: janedoe@example.com",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        color = Color(0xFF8C8C8C),
                        modifier = Modifier
                            .border(
                                color = Color(0xFF959595),
                                width = 1.dp,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(12.dp)
                            .fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Password",
                        fontFamily = FontFamily(Font(R.font.poppins_regular))
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .border(
                                color = Color(0xFF959595),
                                width = 1.dp,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(12.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Enter Password",
                            fontFamily = FontFamily(Font(R.font.poppins_regular)),
                            color = Color(0xFF8C8C8C),
                        )

                        Image(
                            painter = painterResource(id = R.drawable.baseline_visibility_off_24),
                            contentDescription = "visibility"
                        )
                    }

                    Spacer(modifier = Modifier.height(28.dp))

                    Text(
                        text = "Register",
                        fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                        color = Color.White,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .background(
                                color = Color(0xFFE55B5E),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(vertical = 8.dp)
                            .padding(horizontal = 32.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Already have an account?",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = "Login Here",
                        fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                        color = Color(0xFFCF6869),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
        }
    }

}


@Composable
fun Greeting5(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec: width=400dp, height=1025dp"
)
@Composable
fun klairs() {
    VisualProgWeek2Theme {
        Challenge3()
    }
}