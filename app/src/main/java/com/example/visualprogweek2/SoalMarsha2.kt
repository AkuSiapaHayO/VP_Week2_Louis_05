package com.example.visualprogweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visualprogweek2.ui.theme.VisualProgWeek2Theme

class SoalMarsha2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualProgWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting4("Android")
                }
            }
        }
    }
}

@Composable
fun Challenge2(){
    Column (
        modifier = Modifier
            .padding(top = 16.dp)
            .padding(horizontal = 16.dp)
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ){

            Image(
                painter = painterResource(id = R.drawable.black_arrow_back),
                contentDescription = "ArrowBack",
                Modifier
                    .size(26.dp)
            )

            Text(
                text = "Your Cart",
                color = Color(0xFF454545),
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.poppins_bold))
            )

            Image(
                painter = painterResource(id = R.drawable.black_density_medium),
                contentDescription = "BlackDehaze",
                Modifier
                    .size(20.dp)
            )
        }

        Row (
            modifier = Modifier
                .padding(top = 16.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.burger1),
                contentDescription = "Burger1",
                modifier = Modifier
                    .size(145.dp)
                    .clip(RoundedCornerShape(18.dp)),
                contentScale = ContentScale.Crop

            )

            Column (
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .padding(horizontal = 10.dp)
            ){
                Text(
                    text = "Krabby Patty",
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    fontSize = 12.sp,
                    color = Color(0xFF444444)
                )

                Text(
                    text = "Plant Based Whooper",
                    fontFamily = FontFamily(Font(R.font.poppins_bold))
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Rate- ",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.chefemoji),
                        contentDescription = "ChefEmoji",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(16.dp)
                    )
                    
                    Text(
                        text = "  Spicy Level- 5/10",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )
                }

                Text(
                    text = "Rp.12.000",
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontSize = 12.sp
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ){
                    Text(
                        text = "+ 8 -",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.baseline_cancel_presentation_24),
                        contentDescription = "CancelPresentation"
                    )
                }
            }
        }

        Divider(
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Row (
            modifier = Modifier
                .padding(top = 16.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.burger2),
                contentDescription = "Burger2",
                modifier = Modifier
                    .size(145.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentScale = ContentScale.Crop
            )

            Column (
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .padding(horizontal = 10.dp)
            ){
                Text(
                    text = "Krabby Patty",
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    fontSize = 12.sp,
                    color = Color(0xFF444444)
                )

                Text(
                    text = "Extra Spicy Chicken Burger",
                    fontFamily = FontFamily(Font(R.font.poppins_bold))
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Rate- ",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.pepper),
                        contentDescription = "Pepper",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(16.dp)
                    )

                    Text(
                        text = "  Spicy Level- 10/10",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )
                }

                Text(
                    text = "Rp.36.000",
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontSize = 12.sp
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ){
                    Text(
                        text = "+ 5 -",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.baseline_cancel_presentation_24),
                        contentDescription = "CancelPresentation"
                    )
                }
            }
        }



        Divider(
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Row(
            modifier = Modifier
                .padding(top = 16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.burger3),
                contentDescription = "Burger3",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(145.dp)
                    .clip(RoundedCornerShape(20.dp))
            )

            Column (
                modifier = Modifier
                    .padding(vertical = 10.dp)
                    .padding(horizontal = 10.dp)
            ){
                Text(
                    text = "Krabby Patty",
                    fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                    fontSize = 12.sp,
                    color = Color(0xFF444444)
                )

                Text(
                    text = "BBQ Beef Rasher",
                    fontFamily = FontFamily(Font(R.font.poppins_bold))
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(
                        text = "Rate- ",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.thumbsup),
                        contentDescription = "thumbsUp",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(16.dp)
                    )

                    Text(
                        text = "  Spicy Level- 7/10",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )
                }

                Text(
                    text = "Rp.30.000",
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontSize = 12.sp
                )

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ){
                    Text(
                        text = "+ 2 -",
                        fontFamily = FontFamily(Font(R.font.poppins_regular)),
                        fontSize = 12.sp
                    )

                    Image(
                        painter = painterResource(id = R.drawable.baseline_cancel_presentation_24),
                        contentDescription = "CancelPresentation"
                    )
                }
            }
        }

        Divider(
            modifier = Modifier
                .padding(top = 16.dp)
        )

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Delivery Charger",
                color = Color(0xFF474747),
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            )

            Text(
                text = "Free Delivery",
                color = Color(0xFF494949),
                textDecoration = TextDecoration.Underline,
                fontFamily = FontFamily(Font(R.font.poppins_regular))
            )
        }

        Divider(
            modifier = Modifier
                .padding(top = 8.dp)
        )

        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Total Amount",
                fontFamily = FontFamily(Font(R.font.poppins_semibold)),
                color = Color(0xFF444444)
            )

            Text(
                text = "Rp.78.000",
                color = Color(0xFF454545),
                fontFamily = FontFamily(Font(R.font.poppins_semibold))
            )
        }

        Divider(
            modifier = Modifier
                .padding(top = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Rp.78.000",
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                modifier = Modifier
                    .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(16.dp))
                    .padding(vertical = 8.dp)
                    .padding(horizontal = 28.dp),
                fontSize = 18.sp
            )

            Text(
                text = "Continue",
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                fontSize = 18.sp,
                modifier = Modifier
                    .background(color = Color(0xFF273443), shape = RoundedCornerShape(16.dp))
                    .padding(vertical = 8.dp)
                    .padding(horizontal = 54.dp),
                color = Color.White
            )
        }
    }
}

@Composable
fun Greeting4(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    VisualProgWeek2Theme {
        Challenge2()
    }
}