package com.example.profileapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilePage() {
    Column(modifier = Modifier.fillMaxSize()){
        ProfileSection()
    }
}

@Composable
fun ProfileSection(modifier: Modifier = Modifier)
{
    Column(modifier = modifier.fillMaxWidth()){
        Spacer(modifier = modifier.height(8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.person1),
                contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .border(2.dp, Color.Blue, CircleShape)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            FollowingStatusBar(modifier = Modifier.weight(7f))
        }
        Spacer(modifier = Modifier.height(10.dp))

        BioSection(name = "Mohammed", description = "Android Developer")

        Spacer(modifier = Modifier.height(20.dp))

        Row(modifier = Modifier){
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    text = "Edit Profile",
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }
        }


        Spacer(modifier = Modifier.height(10.dp))
        PostsSection()
    }
}

@Composable
fun PostsSection() {
    val imageModifier = Modifier
        .aspectRatio(1f)

    // First row of images
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.jetpackcompose),
            contentDescription = null,
            modifier = imageModifier.weight(1f),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.xmlimage),
            contentDescription = null,
            modifier = imageModifier.weight(1f),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.kotlinimage),
            contentDescription = null,
            modifier = imageModifier.weight(1f),
            contentScale = ContentScale.Crop
        )
    }

    // Second row of images
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.csharpimage),
            contentDescription = null,
            modifier = imageModifier.weight(1f),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.cimage),
            contentDescription = null,
            modifier = imageModifier.weight(1f),
            contentScale = ContentScale.Crop
        )

        Image(
            painter = painterResource(id = R.drawable.javaimage),
            contentDescription = null,
            modifier = imageModifier.weight(1f),
            contentScale = ContentScale.Crop,
        )
    }
}


@Composable
fun BioSection(name: String, description: String) {
    val letterSpacing = 0.5.sp
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)
    ){
        Text(text = name, fontWeight = FontWeight.Bold, fontSize = 14.sp, letterSpacing = letterSpacing)
        Text(text = description, fontWeight = FontWeight.Medium ,fontSize = 11.sp, letterSpacing = letterSpacing)
        Text(text = "Travelling", fontWeight = FontWeight.Medium ,fontSize = 11.sp, letterSpacing = letterSpacing)
        Text(text = "Sleeping", fontWeight = FontWeight.Medium ,fontSize = 11.sp, letterSpacing = letterSpacing)
    }
}


@Composable
fun FollowingStatusBar(modifier: Modifier = Modifier)
{
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ){
        FollowSection(number = "12", label = "Posts", modifier = modifier)
        FollowSection(number = "1.2M", label = "Followers", modifier = modifier)
        FollowSection(number = "666", label = "Following", modifier = modifier)
    }
}

@Composable
fun FollowSection(number: String, label: String, modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ){
        Text(text = number, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = label, fontWeight = FontWeight.SemiBold, fontSize = 12.sp)
    }
}






