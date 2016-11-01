package com.huyvuong.adn.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        // Obtain references to each of the buttons.
        Button btnPopularMovies = (Button) findViewById(R.id.btn_popular_movies);
        Button btnStockHawk = (Button) findViewById(R.id.btn_stock_hawk);
        Button btnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        Button btnMakeYourAppMaterial = (Button) findViewById(R.id.btn_make_your_app_material);
        Button btnGoUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);

        // Assign OnClickListeners to each object to emit a toast message about the app that
        // button will open.
        btnPopularMovies.setOnClickListener(
                newOnClickListenerWithToastPlaceholder(getString(R.string.popular_movies)));
        btnStockHawk.setOnClickListener(
                newOnClickListenerWithToastPlaceholder(getString(R.string.stock_hawk)));
        btnBuildItBigger.setOnClickListener(
                newOnClickListenerWithToastPlaceholder(getString(R.string.build_it_bigger)));
        btnMakeYourAppMaterial.setOnClickListener(
                newOnClickListenerWithToastPlaceholder(getString(R.string.make_your_app_material)));
        btnGoUbiquitous.setOnClickListener(
                newOnClickListenerWithToastPlaceholder(getString(R.string.go_ubiquitous)));
        btnCapstone.setOnClickListener(
                newOnClickListenerWithToastPlaceholder(getString(R.string.capstone_my_own_app)));
    }

    private View.OnClickListener newOnClickListenerWithToastPlaceholder(final String projectName) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = String.format(getString(R.string.toast_launch), projectName);
                Toast.makeText(PortfolioActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        };
    }
}
