Rails.application.routes.draw do
  get 'users/index'

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
