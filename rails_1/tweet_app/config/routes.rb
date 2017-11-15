Rails.application.routes.draw do
  get 'posts/index' => 'posts#index'

  get 'top' => 'home#top'
  get 'about' => 'home#about'
  get '/' => 'home#top'
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
end
