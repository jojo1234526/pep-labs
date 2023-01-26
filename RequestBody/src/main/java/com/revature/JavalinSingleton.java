package com.revature;

import io.javalin.Javalin;

import io.javalin.Javalin;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.Song;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
                //implement logic here
                ObjectMapper mapper = new ObjectMapper();
                Song song = mapper.readValue(ctx.body(), Song.class);
                ctx.result(song.getArtistName());
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
               //implement logic here

               ObjectMapper mapper = new ObjectMapper();
               Song song = mapper.readValue(ctx.body(), Song.class);
               song.setArtistName("Beatles");
               ctx.result(mapper.writeValueAsString(song));
        });


        return app;
    }
    
}
