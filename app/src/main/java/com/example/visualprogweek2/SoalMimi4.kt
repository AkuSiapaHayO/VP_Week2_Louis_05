package com.example.visualprogweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visualprogweek2.ui.theme.VisualProgWeek2Theme

class SoalMimi4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualProgWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting6("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting6(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = "spec: width=400dp, height=1100dp"
)
@Composable
fun Profile() {
    VisualProgWeek2Theme {
        Challenge4()
    }
}

@Composable
fun Challenge4(){
    Column (
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ){
        Column (
            modifier = Modifier
                .background(Color(0xFF1019CD))
                .padding(28.dp)
                .fillMaxWidth()
        ){
            Row (
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(id = R.drawable.baseline_arrow_back_24_white),
                    contentDescription = "WhiteArrow",
                    modifier = Modifier
                        .size(30.dp)
                )

                Text(
                    text = "Profile",
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    color = Color.White,
                    fontSize = 22.sp
                )

                Image(
                    painter = painterResource(id = R.drawable.baseline_create_24),
                    contentDescription = "WhiteCreate",
                    modifier = Modifier
                        .size(26.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){
                Column (
                ){
                    Text(
                        text = "Evan Tanuwijaya",
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        color = Color.White,
                        fontSize = 20.sp
                    )

                    Text(
                        text = "Ciputra University",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        color = Color.White
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.pakevan),
                    contentDescription = "pakEvan",
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(110.dp),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(40.dp))
        }

        Box (
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .offset(y = (-40).dp)
                .shadow(
                    elevation = 1.dp,
                    shape = RoundedCornerShape(16.dp),
                    ambientColor = Color(0xFFFFFFFF)
                )
                .background(
                    Color.White,
                    shape = RoundedCornerShape(16.dp)
                )
        ){
            Column (
                modifier = Modifier
                    .padding(24.dp)
            ){
                Text(
                    text = "Personal Data",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Divider()

                Spacer(modifier = Modifier.height(16.dp))

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column {
                        Text(
                            text = "NIDN",
                            color = Color(0xFF8B8B8B),
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )

                        Text(
                            text = "0123456789",
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = "Occupation",
                            color = Color(0xFF8B8B8B),
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )

                        Text(
                            text = "Lecturer",
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )
                    }

                    Column {
                        Text(
                            text = "Date of Birth",
                            color = Color(0xFF8B8B8B),
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )

                        Text(
                            text = "1 January 1996",
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = "Marital Status",
                            color = Color(0xFF8B8B8B),
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )

                        Text(
                            text = "Single",
                            fontFamily = FontFamily(Font(R.font.poppins_semibold))
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Email",
                    color = Color(0xFF8B8B8B),
                    fontFamily = FontFamily(Font(R.font.poppins_semibold))
                )

                Text(
                    text = "evan.tanuwijaya@ciputra.ac.id",
                    fontFamily = FontFamily(Font(R.font.poppins_semibold))
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box (
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .offset(y = (-40).dp)
                .shadow(
                    elevation = 1.dp,
                    shape = RoundedCornerShape(16.dp),
                    ambientColor = Color(0xFFFFFFFF)
                )
                .background(
                    Color.White,
                    shape = RoundedCornerShape(16.dp)
                )
        ){
            Column (
                modifier = Modifier
                    .padding(24.dp)
            ){
                Text(
                    text = "Expertise",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Divider()

                Spacer(modifier = Modifier.height(16.dp))

                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.androidstudio_logo),
                        contentDescription = "Android Studio",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Android Development",
                        fontFamily = FontFamily(Font(R.font.poppins_semibold))
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row {
                    Image(
                        painter = painterResource(id = R.drawable.logo_oop),
                        contentDescription = "Logo OOP",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Object Oriented Programming",
                        fontFamily = FontFamily(Font(R.font.poppins_semibold))
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box (
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .offset(y = (-40).dp)
                .shadow(
                    elevation = 1.dp,
                    shape = RoundedCornerShape(16.dp),
                    ambientColor = Color(0xFFFFFFFF)
                )
                .background(
                    Color.White,
                    shape = RoundedCornerShape(16.dp)
                )
        ){
            Column (
                modifier = Modifier
                    .padding(24.dp)
            ){
                Text(
                    text = "Send A Message",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Divider()

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Write A Message",
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    color = Color(0xFF505050),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFA2A2A2),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .padding(vertical = 12.dp)
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Send",
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    color = Color.White,
                    modifier = Modifier
                        .background(
                            Color(0xFF1019CD),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .padding(vertical = 8.dp)
                        .padding(horizontal = 28.dp)
                        .align(Alignment.CenterHorizontally)
                )
            }
        }
    }

}