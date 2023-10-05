package com.example.visualprogweek2

import androidx.compose.ui.text.font.Font
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.ui.unit.sp
import android.os.Bundle
import android.provider.SyncStateContract.Columns
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visualprogweek2.ui.theme.VisualProgWeek2Theme
import com.example.visualprogweek2.ui.theme.darkerWhiteGray
import com.example.visualprogweek2.ui.theme.gray
import com.example.visualprogweek2.ui.theme.poppinsFont
import com.example.visualprogweek2.ui.theme.poppinsFontBold
import com.example.visualprogweek2.ui.theme.reviews
import com.example.visualprogweek2.ui.theme.whiteGray


class SoalMarsha : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualProgWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Challenge1() {
    Column (
        modifier = Modifier.background(whiteGray),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Row (
            verticalAlignment = Alignment.CenterVertically, // Center the content vertically
            horizontalArrangement = Arrangement.SpaceBetween, // Add space between the elements
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ){

            Image(
                painter = painterResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "ImageArrowBack",
                modifier = Modifier.size(24.dp)
                )
            Text(
                text = "Roasted Chicken",
                textAlign = TextAlign.Center,
                fontSize = 22.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppinsFontBold,
                color = darkerWhiteGray
                )
            Image(
                painter = painterResource(id = R.drawable.baseline_density_medium_24),
                contentDescription = "ImageDehaze",
                modifier = Modifier.size(22.dp)
            )
        }

        Image(
            painter = painterResource(id = R.drawable.pngwing_com),
            contentDescription = "ImageChicken",
            modifier = Modifier
                .size(325.dp)
                .fillMaxWidth(),
        )

        Column(
            modifier = Modifier
                .background(
                    gray,
                    shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
                )
                .fillMaxSize()
                .padding(16.dp)
                .padding(top = 6.dp)
        ) {
            Text(
                text = "King Box Roasted Chicken",
                color = whiteGray,
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.poppins_semibold))
            )
            Spacer(modifier = Modifier.height(12.dp))
            Row (

            ){
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "YellowStar"
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "YellowStar"
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_24),
                    contentDescription = "YellowStar"
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_half_24),
                    contentDescription ="halfStar"
                )
                Image(
                    painter = painterResource(id = R.drawable.baseline_star_outline_yellow_24),
                    contentDescription = "EmptyStar"
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "3.5",
                    color = whiteGray,
                    fontFamily = poppinsFont
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "(684 Reviews)",
                    color = reviews,
                    fontFamily = poppinsFont
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text ="1 Roasted Chicken (Full Chicken)" +
                        " + 1 Cheesy Beef Burger" +
                        " + 4 White Rice" +
                        " + 4 Diet Coke" +
                        " + 1 Spider-Verse Toys : Brooklyn Sky Scrapper" +
                        " + 2 Super Float Coke",
                color = whiteGray,
                fontSize = 16.sp,
                fontFamily = poppinsFont
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Read More...",
                color = whiteGray,
                fontSize = 16.sp,
                textDecoration = TextDecoration.Underline,
                fontFamily = poppinsFont
            )

            Row (
                modifier = Modifier
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = "Rp.40,909",
                    color = whiteGray,
                    fontSize = 26.sp,
                    fontFamily = poppinsFontBold
                )
                Text(
                    text = "Add to Cart",
                    fontSize = 24.sp,
                    modifier = Modifier
                        .background(
                            Color.White,
                            shape = RoundedCornerShape(
                                topStart = 20.dp,
                                topEnd = 20.dp,
                                bottomStart = 20.dp,
                                bottomEnd = 20.dp
                            )
                        )
                        .padding(vertical = 8.dp, horizontal = 24.dp),
                    fontFamily = poppinsFontBold
                )
            }
        }

    }
}

@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DetailProduct() {
    VisualProgWeek2Theme {
        Challenge1()
    }
}