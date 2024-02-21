package com.practice.project.api;

import com.google.gson.JsonObject;
import com.practice.project.entity.Students;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface API {
    @GET("/students")
    public Call<JsonObject> getAllStudents();

    @GET("/students/{id}")
    public Call<JsonObject> getStudentById(@Path("id") int studentId);

    @POST("/students")
    public Call<JsonObject> addStudent(@Body Students student);

    @PUT("/students/{id}")
    public Call<JsonObject> updateStudent(@Path("id") int studentId, @Body Students student);

    @DELETE("/students/{id}")
    public Call<JsonObject> deleteStudent(@Path("id") int studentId);

    @POST("/students/login")
    public Call<JsonObject> loginStudent(@Body Students student);
}
