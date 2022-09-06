package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayCardWithImage(message = "Happy Birthday Sam !!",fromMessage = "Kotlin")
                }
            }
        }
    }
}

@Composable
fun BirthdayCardWithImage(message: String, fromMessage: String) {
    val cupCakeImage = painterResource(id = R.drawable.androidparty)
    // Creates a box Layout to view text on top of image
    Box {
        Image(painter = cupCakeImage, contentDescription = null,
            modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        BirthdayGreetingWithText(message, fromMessage)
    }
}

@Composable
fun BirthdayGreetingWithText(message: String, fromMessage: String) {
    // Creates a column layout to separate text boxes
    Column {
        Text(text = message, fontSize = 36.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(horizontal = 10.dp))
        Text(text = fromMessage, fontSize = 18.sp, modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally)
            .padding(top = 10.dp, end = 10.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithTextPreview() {
    BirthdayCardTheme {
        BirthdayCardWithImage(message = stringResource(R.string.happy_birthday_text),fromMessage = stringResource(
                    R.string.from_name)
                )
    }
}