package com.example.visualprogweek2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.visualprogweek2.ui.theme.Color1
import com.example.visualprogweek2.ui.theme.Color2
import com.example.visualprogweek2.ui.theme.Color3
import com.example.visualprogweek2.ui.theme.Color4
import com.example.visualprogweek2.ui.theme.VisualProgWeek2Theme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualProgWeek2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun quadrantView() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ColumnFill(
                title = "Text Composable",
                text = "Displays text and follows the recommended Material Design guidelines.\n",
                modifier = Modifier.weight(1f).background(Color1))
            ColumnFill(
                title = "Image Composable",
                text = "Creates a composable that lays out and draws a given Painter class object.\n",
                modifier = Modifier.weight(1f).background(Color2)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            ColumnFill(
                title = "Row Composable",
                text = "A layout composable that places its children in a horizontal sequence.\n",
                modifier = Modifier.weight(1f).background(Color3)
            )
            ColumnFill(
                title = "Column Composable",
                text = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f).background(Color4)
                )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantPreview2() {
    VisualProgWeek2Theme {
        quadrantView()
    }
}

@Composable
fun text(text: String,
         fontWeight: FontWeight,
         textAlign: TextAlign,
         modifier: Modifier
    ) {
    Text(text = text,
        fontWeight = fontWeight,
        textAlign = textAlign,
        modifier = modifier,
    )
}

@Composable
fun ColumnFill(
    title: String,
    text: String,
    modifier: Modifier,
    ) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        text(text = title, fontWeight = FontWeight.Bold , textAlign = TextAlign.Center, modifier = Modifier.padding(bottom = 16.dp))
        text(text = text, fontWeight = FontWeight.Normal, textAlign = TextAlign.Justify, modifier = Modifier.padding())
    }
}