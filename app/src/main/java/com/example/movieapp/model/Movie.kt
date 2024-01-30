package com.example.movieapp.model

import android.icu.text.CaseMap.Title

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String

)

fun getMovies(): List<Movie>{
    return listOf(

        Movie(
            id = "1",
            title = "They Shall Not Grow Old",
            year = "2018",
            genre = "Documentary, History, War",
            director = "Peter Jackson",
            actors = "Mark Kermode, Peter Jackson",
            plot =  "A documentary about World War I with never-before-seen footage " +
                    "to commemorate the centennial of the end of the war.",
            poster = "https://m.media-amazon.com/images/M/MV5BZWI3ZThmYzUtNDJhOC00ZWY4LThiNmMtZDgxNjE3Yzk4NDU1XkEyXkFqcGdeQXVyNTk5Nzg1NjQ@._V1_SX300.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/I/812nbLi1H-L._AC_UF1000,1000_QL80_.jpg",
                "https://media.newyorker.com/photos/5c2fdd562bfcc72cd92d0da3/16:9/w_2559,h_1439,c_limit/Gopnik-They-Shall-Not-Grow-Old.jpg",
                "https://m.media-amazon.com/images/S/pv-target-images/8788b01c3e86a42d74e53b857afc8ffd142db0d749d057f6e899da3e7bb5afd8.jpg"
            ),
            rating = "8.3"
        ),

        Movie(
            id = "2",
            title = "Midnight Family",
            year = "2019",
            genre = "Documentary, Action, Crime, Drama",
            director = "Luke Lorentzen",
            actors = "Fer Ochoa, Josue Ochoa, Juan Ochoa",
            plot =  "In Mexico City's wealthiest neighborhoods, the Ochoa family " +
                    "runs a private ambulance, competing with other for-profit EMTs " +
                    "for patients in need of urgent help.",
            poster = "https://m.media-amazon.com/images/M/MV5BMGYyZTk5MjYtNGY2ZS00NzRhLTgwMWMtZjhmMmQ4OGFkNTNiXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BMzM5YWUxN2ItOTVhOC00NDdjLWIyOGItZjQ3YmQ4N2Q4MjRjXkEyXkFqcGdeQXVyMTU3NDU4MDg2._V1_.jpg",
                "https://static.pragda.com/uploads/2021/03/MidnightFamily_1200-600.jpg",
                "https://m.media-amazon.com/images/M/MV5BOTE2NzU5MGEtZjEwZS00MjkzLWJkMTEtNjNlNTBlY2MzNzA1XkEyXkFqcGdeQXVyMzQ5Njc3NzU@._V1_.jpg"
            ),
            rating = "7.8"
        ),

        Movie(
            id = "3",
            title = "Pain & Gain",
            year = "2013",
            genre = "Action, Comedy, Crime, Drama",
            director = "Michael Bay",
            actors = "Mark Wahlberg, Dwayne Johnson, Anthony Mackie, Tony Shalhoub",
            plot = "extortion ring and a kidnapping scheme that goes terribly wrong.",
            poster = "https://m.media-amazon.com/images/M/MV5BMTU0NDE5NTU0OV5BMl5BanBnXkFtZTcwMzI1OTMzOQ@@._V1_SX300.jpg",
            images = listOf(
                "https://lh3.googleusercontent.com/proxy/n6Zt5a9JtXFU0HoqpPRgkk-MeNFX8kg_gKxN6rBiEVt75B3Q7OhPnhcwTfQxOrhmBbbLBeSHQBfg9s2BQL4dowJAuw22Jn7o5bjCt5mj7Xtc7R6B1e4Jh9mFL3f8QeLj6wDov1--bPLyqEoghYk",
                "https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p9491358_p_v10_ar.jpg",
                "https://external-preview.redd.it/2RjLIicEm_9ZssFOs6b9pNiQCm_dKnh2gxu-xtBImbg.jpg?width=640&crop=smart&auto=webp&s=af7b630061741d3b2faf18cf202aba37210f054c"
            ),
            rating = "6.4"
        ),

        Movie(
            id = "4",
            title = "Parasite",
            year = "2019",
            genre = "Comedy, Drama, Thriller",
            director = "Bong Joon Ho",
            actors = "Kang-ho Song, Sun-kyun Lee, Yeo-jeong Jo, Woo-sik Choi",
            plot =  "All unemployed, Ki-taek and his family take peculiar interest in the wealthy and glamorous Parks, as they ingratiate themselves into their lives and get entangled in an unexpected incident " +
                    "to commemorate the centennial of the end of the war.",
            poster = "https://m.media-amazon.com/images/M/MV5BYWZjMjk3ZTItODQ2ZC00NTY5LWE0ZDYtZTI3MjcwN2Q5NTVkXkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_SX300.jpg",
            images = listOf(
                "https://media.newyorker.com/photos/5da4a5c756dcd400082a63ba/master/pass/Brody-Parasite.jpg",
                "https://m.media-amazon.com/images/S/pv-target-images/0ca6d79319601eaa8292c41247599f47001c67fec9a47a8c765d2a6e4ac012da.jpg",
                "https://miro.medium.com/v2/resize:fit:897/1*A7RgSOPsn2IGETH4R1A2tw.jpeg"
            ),
            rating = "8.6"
        ),

        Movie(
            id = "5",
            title = "Little Women",
            year = "1994",
            genre = "Drama, Family, Romance",
            director = "Gillian Armstrong",
            actors = "Winona Ryder, Gabriel Byrne, Trini Alvarado, Samantha Mathis",
            plot = "The March sisters live and grow in post-Civil War America.",
            poster = "https://m.media-amazon.com/images/I/91j2nOoYm0L._AC_UF1000,1000_QL80_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BY2QzYTQyYzItMzAwYi00YjZlLThjNTUtNzMyMDdkYzJiNWM4XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BOGMwNGY1NmUtYTViZS00MGZlLWJiNjItM2ViOTA0NjI0MTM0XkEyXkFqcGdeQXVyNDczNjA4MjY@._V1_.jpg",
                "https://m.media-amazon.com/images/I/61UIhaYDSLL._AC_UF1000,1000_QL80_.jpg"
            ),
            rating = "7.3"
        ),

        Movie(
            id = "6",
            title = "Salaar: Part 1 – Ceasefire",
            year = "2023",
            genre = "Action, Thriller",
            director = "Prashanth Neel",
            actors = "Prabhas, Prithviraj Sukumaran, Shruti Haasan",
            plot =  "The fate of a violently contested kingdom hangs " +
                    "on the fraught bond between two friends-turned-foes in this saga of power, bloodshed and betrayal",
            poster = "https://m.media-amazon.com/images/M/MV5BMmU4ZTM0MTctZTQ3Ny00YjZmLWFhNzEtOGYzMDk0ZjcyNmYzXkEyXkFqcGdeQXVyMTUyNjIwMDEw._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://www.hindustantimes.com/ht-img/img/2023/12/22/1600x900/salaar_review_1703231884816_1703231887255.jpeg",
                "https://assets.telegraphindia.com/telegraph/2023/Dec/1703243689_salaar-1.jpg",
                "https://m.media-amazon.com/images/M/MV5BN2QwY2FhZjAtNTY1OC00NDU0LThhMWQtYTQ5Y2I5MmU4ZmE1XkEyXkFqcGdeQXVyMTUyNjIwMDEw._V1_.jpg"
            ),
            rating = "6.6"
        ),

        Movie(
            id = "7",
            title = "Soorarai Pottru",
            year = "2020",
            genre = "Action, Drama",
            director = "Sudha Kongara",
            actors = "Suriya, Paresh Rawal, Urvashi",
            plot =  "Nedumaaran Rajangam 'Maara' sets out to make the common man fly and in the process takes on" +
                    " the world's most capital intensive industry and several enemies who stand in his way.",
            poster = "https://m.media-amazon.com/images/M/MV5BOTc2ZTlmYmItMDBhYS00YmMzLWI4ZjAtMTI5YTBjOTFiMGEwXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_.jpg",
            images = listOf(

            ),
            rating = "8.7"
        ),

        Movie(
            id = "8",
            title = "Uri: The Surgical Strike",
            year = "2019",
            genre = "Action, War",
            director = "Aditya Dhar",
            actors = "Vicky Kaushal, Paresh Rawal, Mohit Raina",
            plot =  "Uri: The Surgical Strike ... Indian army special " +
                    "forces execute a covert operation, avenging the killing " +
                    "of fellow army men at their base by a terrorist group.",
            poster = "https://m.media-amazon.com/images/M/MV5BMWU4ZjNlNTQtOGE2MS00NDI0LWFlYjMtMmY3ZWVkMjJkNGRmXkEyXkFqcGdeQXVyNjE1OTQ0NjA@._V1_FMjpg_UX1000_.jpg",
            images = listOf(
                "https://akamaividz2.zee5.com/image/upload/w_1170,h_658,c_scale,f_webp,q_auto:eco/resources/0-0-33204/list/1170x658withlogo30e97cec02bc4aa197d9e5cec926be32a223c5a49e384f24a54222dd96e25c0e.jpg",
                "https://images.livemint.com/rf/Image-621x414/LiveMint/Period2/2019/01/12/Photos/Processed/uri1-U20573096666kjH--621x414@LiveMint.jpg",
                "https://upload.wikimedia.org/wikipedia/en/3/3b/URI_-_New_poster.jpg"
            ),
            rating = "8.2"
        ),

        Movie(
            id = "9",
            title = "RRR",
            year = "2022",
            genre = "Action, Thriller",
            director = "S. S. Rajamouli",
            actors = "N.T. Rama Rao Jr., Ram Charan, Alia Bhatt, Ajay Devgn",
            plot =  "A fictitious story about two legendary revolutionaries and " +
                    "their journey away from home before they started fighting for their country in the 1920s",
            poster = "https://m.media-amazon.com/images/M/MV5BOGEzYzcxYjAtZmZiNi00YzI0LWIyY2YtOTM0MDFjODU2YTZiXkEyXkFqcGdeQXVyMTQ3Mzk2MDg4._V1_.jpg",
            images = listOf(
                "https://images.indianexpress.com/2021/01/rrr-release-date-1200.jpg",
                "https://m.media-amazon.com/images/M/MV5BMGFjZjEwM2MtMmExZC00MWNiLTkzMDEtMWZkMjAzOTUxODRhXkEyXkFqcGdeQXVyMTQ3Mzk2MDg4._V1_.jpg",
                "https://filmfare.wwmindia.com/content/2023/jul/rrr41688980930.jpg"
            ),
            rating = "7.8"
        ),

        Movie(
            id = "10",
            title = "Jersey",
            year = "2019",
            genre = "Sport, Drama",
            director = "Gowtam Tinnanuri",
            actors = "Nani, Shraddha Srinath, Sathyaraj",
            plot =  "A failed cricketer decides to revive his cricketing career in his late 30's" +
                    " despite everyone being skeptical of his ability to do so.",
            poster = "https://m.media-amazon.com/images/M/MV5BYzBhZWQxOGUtZWVmMi00ZmZhLWJjZDYtMGUxY2I4ZDdlOGEyXkEyXkFqcGdeQXVyODMyODMxNDY@._V1_.jpg",
            images = listOf(
                "https://m.media-amazon.com/images/M/MV5BZTZhZmNlZmItOWRlNC00YjE3LTg5M2YtNDliMjk5MjI0MWMzXkEyXkFqcGdeQXVyODMyODMxNDY@._V1_.jpg",
                "https://m.media-amazon.com/images/M/MV5BYzVmZWJlYWMtYjYxNC00MTk0LTgzYjYtNWEyZjZiOTg2NTA3XkEyXkFqcGdeQXVyODMyODMxNDY@._V1_.jpg",
                "https://assets.thehansindia.com/h-upload/feeds/2019/04/20/166274-jersy-2.jpg"
            ),
            rating = "8.5"
        ),
    )
}