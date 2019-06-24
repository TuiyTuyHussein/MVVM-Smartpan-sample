/**
 * Copyright 2016 Erik Jhordan Rey.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smartpan.sa.mvvmsmartpansample.view.activities;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

import smartpan.sa.mvvmsmartpansample.R;
import smartpan.sa.mvvmsmartpansample.databinding.ItemRowBinding;
import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoryListItem;
import smartpan.sa.mvvmsmartpansample.viewmodel.ItemViewModel;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesAdapterViewHolder> {

    private List<CategoryListItem> categoriesList = new LinkedList<>();

    CategoriesAdapter() {
    }

    @NonNull
    @Override
    public CategoriesAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRowBinding itemBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_row,
                        parent, false);
        return new CategoriesAdapterViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(CategoriesAdapterViewHolder holder, int position) {
        holder.bindItem(categoriesList.get(position));
    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    void setCategoriesList(List<CategoryListItem> categoriesList) {
        if (categoriesList == null || categoriesList.size() == 0) return;
        this.categoriesList.clear();
        this.categoriesList.addAll(categoriesList);
        notifyDataSetChanged();
    }

    static class CategoriesAdapterViewHolder extends RecyclerView.ViewHolder {
        ItemRowBinding mItemRowBinding;

        CategoriesAdapterViewHolder(ItemRowBinding itemPeopleBinding) {
            super(itemPeopleBinding.getRoot());
            this.mItemRowBinding = itemPeopleBinding;
        }

        void bindItem(CategoryListItem item) {
            if (mItemRowBinding.getItemViewModel() == null) {
                mItemRowBinding.setItemViewModel(new ItemViewModel(item));
            } else {
                mItemRowBinding.getItemViewModel().setItem(item);
            }
        }
    }
}
