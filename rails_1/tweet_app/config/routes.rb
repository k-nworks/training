Rails.application.routes.draw do

  devise_for :users
  # devise_for :users
  get "users/:id/likes" => "users#likes"
  post "likes/:post_id/destroy" => "likes#destroy"
  post "likes/:post_id/create" => "likes#create"

  post "logout" => "users#logout"
  post "login" => "users#login"
  get "login" => "users#login_form"

  post 'users/:id/update' => 'users#update'
  get 'users/:id/edit' => 'users#edit'
  post 'users/create' => 'users#create'
  get 'signup' => 'users#new'
  get 'users/index'
  get 'users/:id/show' => 'users#show'
  get 'users/:id' => 'users#show'

  get 'posts/index' => 'posts#index'
  get 'posts/new' => 'posts#new'
  post 'posts/create' => 'posts#create'
  get 'posts/:id/edit' => 'posts#edit'
  post 'posts/:id/update' => 'posts#update'
  post 'posts/:id/destroy' => 'posts#destroy'
  get 'posts/:id'  => 'posts#show'

  get 'top' => 'home#top'
  get 'about' => 'home#about'
  get '/' => 'home#top'
end
